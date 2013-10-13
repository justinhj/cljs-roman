(ns roman.core-test
  (:use clojure.test
        roman.main))

(deftest roman-1-test
  (testing "basic roman to integer test"
    (is (= (roman-numerals-to-decimal "XI") 11))))

(deftest roman-2-test
  (testing "basic roman to integer test 2"
    (is (= (roman-numerals-to-decimal "X") 11))))

(deftest test-fail-me
  (testing "basic roman to integer test 3"
    (is (= 1 0))))




