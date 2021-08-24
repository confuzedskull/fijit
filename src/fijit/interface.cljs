(ns fijit.interface
  (:require [fijit.strings :as txt]
            [fijit.network :as net]))

(defn button [l c & s]
  [:input {:type "button"
           :value l
           :on-click c
           :style s}])

(defn text-input [p v & t]
  [:input {:type (or t "text")
           :placeholder p
           :value @v
           :on-change #(reset! v
                               (-> % .-target .-value))}])

(defn send []
  [button txt/send-button
   #(net/send @net/data)])

(defn data []
  [text-input txt/data net/data])

(defn receive []
  [button txt/receive-button
   #(net/receive)])