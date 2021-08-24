(defproject fijit "1.0.0"
  :dependencies [[com.bhauman/figwheel-main "0.2.14"]
                 [com.bhauman/rebel-readline-cljs "0.1.4"]
                 [org.clojure/clojurescript "1.10.879"]
                 [cljsjs/react-dom "17.0.2-0"]
                 [cljsjs/react "17.0.2-0"]
                 [cljs-ajax "0.8.4"]
                 [reagent "1.1.0"]]
  :resource-paths ["target"]
  :aliases {"figwheel" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]})