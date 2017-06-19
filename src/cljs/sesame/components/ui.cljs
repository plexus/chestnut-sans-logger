(ns sesame.components.ui
  (:require [com.stuartsierra.component :as component]
            [sesame.core :refer [render]]))

(defrecord UIComponent []
  component/Lifecycle
  (start [component]
    (render)
    component)
  (stop [component]
    component))

(defn new-ui-component []
  (map->UIComponent {}))
