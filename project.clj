(defproject rerenderer-js "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 [rerenderer "0.2.0"]]
  :plugins [[lein-cljsbuild "1.1.2"]]
  :cljsbuild {:builds {:js {:source-paths ["src"]
                            :compiler {:output-to "target/js/compiled.js"
                                       :output-dir "target/js/"
                                       :optimizations :whitespace
                                       :target :nodejs
                                       :pretty-print true}}}})
