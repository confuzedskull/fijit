(ns fijit.interface
  (:require [fijit.strings :as txt]
            [fijit.network :as net]
            [fijit.styles :as css :refer [style]]))

(defn button [l c & s]
  [:input (conj {:type "button"
                 :value l
                 :on-click c}
                (style css/button (first s)))])

(defn text-input [p v & t]
  [:input {:type (or t "text")
           :placeholder p
           :value @v
           :on-change #(reset! v
                               (-> % .-target .-value))}])

(defn send []
  [button txt/send-button
   #(net/send @net/data) css/send-button])

(defn data []
  [text-input txt/data net/data])

(defn receive []
  [button txt/receive-button
   #(net/receive) css/receive-button])
