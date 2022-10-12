(defproject fijit "1.0.2"
  :dependencies [[com.bhauman/figwheel-main "0.2.17"]
                 [com.bhauman/rebel-readline-cljs "0.1.4"]
                 [org.clojure/clojurescript "1.11.4"]
                 [org.clojure/clojure "1.10.3"]
                 [org.slf4j/slf4j-nop "1.7.30"]
                 [cljsjs/react-dom "17.0.2-0"]
                 [cljsjs/react "17.0.2-0"]
                 [cljs-ajax "0.8.4"]
                 [reagent "1.1.1"]]
  :resource-paths ["target"]
  :aliases {"debug" ["trampoline" "run" "-m" "figwheel.main" "-b" "debug" "-r"]
            "release" ["run" "-m" "figwheel.main" "-bo" "release"]
            "test"  ["run" "-m" "figwheel.main" "-co" "test.cljs.edn" "-m" "fijit.test-runner"]})
