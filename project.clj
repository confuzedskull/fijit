(defproject fijit "1.0.1"
  :cljsbuild {:builds
              [{:compiler {:optimizations :advanced
                           :output-to "bin/main.js"
                           :warnings {:munged-namespace false}}
                :source-paths ["src"]}]}
  :dependencies [[com.bhauman/figwheel-main "0.2.14"]
                 [com.bhauman/rebel-readline-cljs "0.1.4"]
                 [org.clojure/clojurescript "1.10.879"]
                 [org.clojure/clojure "1.10.3"]
                 [cljsjs/react-dom "17.0.2-0"]
                 [cljsjs/react "17.0.2-0"]
                 [cljs-ajax "0.8.4"]
                 [reagent "1.1.0"]]
  :plugins [[lein-cljsbuild "1.1.8"]]
  :resource-paths ["target"]
  :aliases {"figwheel" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]})