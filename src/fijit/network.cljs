(ns fijit.network
  (:require [ajax.core :as jax]
            [fijit.strings :as txt]
            [reagent.core :as rea]))

(def base-url "http://localhost:8090")

(def endpoint "/secret")

(def data (rea/atom nil))

(def response (atom {}))

(defn handle [a & m]
  (fn [r]
    (reset! a r)
    (if (some? m)
      (js/alert (str (first m) r))
      (js/log r))))

(defn send [b & e]
  (jax/PUT (str base-url
                (if (some? e)
                  e
                  endpoint))
    {:handler (handle response (str txt/send-success b))
     :format :json
     :params b}))

(defn receive [& e]
  (jax/GET (str base-url
                (if (some? e)
                  e
                  endpoint))
    {:handler (handle response txt/receive-success)}))