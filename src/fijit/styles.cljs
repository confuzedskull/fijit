(ns fijit.styles)

(defn style [& s]
  {:style (apply conj s)})

(def global {:color "white"
             :background-color "black"})

(def h1 {:color "#00FF00"})

(def p {:color "white"
        :background-color "gray"})

(def button {:background-color "white"})

(def send-button {:color "red"})

(def receive-button {:color "green"})
