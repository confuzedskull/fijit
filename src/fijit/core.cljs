(ns fijit.core
  (:require [reagent.dom :as dom]
            [fijit.strings :as txt]
            [fijit.interface :as gui]
            [fijit.styles :as css :refer [style]]))

(defn index []
  [:html (css/style css/global)
   [:head
    [:title txt/title]]
   [:body
    [:main
     [:article
      [:h1 (style css/global css/h1) txt/h1]
      [:p (style css/global css/p) txt/p]]
     [gui/send]
     [gui/data]
     [gui/receive]]]])

(dom/render [index]
            (.getElementById js/document "app"))