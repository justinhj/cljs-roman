(defproject roman "0.1.0-SNAPSHOT"
  :description "Convert numbers to and from Roman numerals"
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [prismatic/dommy "0.1.2"]]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :cljsbuild {
              :builds [{
                        ;; The path to the top-level ClojureScript source directory:
                        :source-paths ["src/cljs"]
                        ;; The standard ClojureScript compiler options:
                        ;; (See the ClojureScript compiler documentation for details.)
                        :compiler {
                                   :output-to "javascripts/main.js"  ; default: target/cljsbuild-main.js
                                   :optimizations :simple
                                   :pretty-print true}}]})

