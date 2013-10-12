(ns roman.main
  (:require[clojure.browser.event :as event]
            [crate.core :as crate]
            [dommy.core :as dommy]
            [dommy.utils :as utils])
  (:use-macros
   [dommy.macros :only [node sel sel1]]))

;; Shoutouts
;; https://coderwall.com/p/gkcnia Event handling guide
;; http://getbootstrap.com/ Twitter bootstrap
;; https://github.com/Prismatic/dommy JQuery-like DOM manipulation, events and more
;; https://github.com/tlberglund/anxious-cows Good tutorial on clojurescript and more

;; convert a string of roman numerals into a number

(defn roman-numerals-to-decimal[str]
  (let [vm {\I 1, \V 5,\X 10,\L 50,\C 100,\D 500,\M 1000}]
    (reduce #(if (>= (first %2) (second %2))
               (+ %1 (first %2))
               (+ %1 (- (second %2) (first %2)) (- (second %2))))
            0
            (partition 2 1 '(0)
                       (map #(get vm %) str)))))

;; write roman numerals
;; http://www.4clojure.com/problem/104

(defn decimal-to-roman-numerals[num]
  (let [svm (into (sorted-map-by >) {1000 "M", 500 "D", 350 "LC", 100 "C", 50 "L", 40 "XL", 10 "X", 5 "V", 4 "IV", 1 "I", 9 "IX", 900 "CM", 90 "XC"})]
    (letfn [(rn [r o]
              (if (= r 0)
                o
                (let [d (first (filter #(<= (first %) r) svm))]
                  (rn (- r (first d)) (str o (second d))))))]
      (rn num ""))))

(defn num_to_roman[]
  (let [num (dommy/value (sel1 :#decimal_input))]
    (-> (sel1 :#roman_input)
        (dommy/set-value! (decimal-to-roman-numerals num)))))

(defn roman_to_num[]
  (let [num (dommy/value (sel1 :#roman_input))]
    (-> (sel1 :#decimal_input)
        (dommy/set-value! (roman-numerals-to-decimal num)))))

;; event handlers

(defn on-decimal-changed [ev]
    (num_to_roman))

(defn on-roman-changed [ev]
    (roman_to_num))

;; register event handlers

(dommy/listen! (sel1 :#decimal_input)
               :input on-decimal-changed)

(dommy/listen! (sel1 :#roman_input)
               :input on-roman-changed)

;; How to log stuff
;; (.log js/console (pr-str (by-id :decimal_input))))

;; How to alert
;; (js/alert (str "HEY YO!" (double 313)))
