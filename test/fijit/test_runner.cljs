;; This test runner is intended to be run from the command line
(ns fijit.test-runner
  (:require
    ;; require all the namespaces that you want to test
    [fijit.core-test]
    [figwheel.main.testing :refer-macros [run-tests-async]]))

(defn -main [& args]
  (run-tests-async 5000))
