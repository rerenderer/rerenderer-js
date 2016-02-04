(ns rerenderer-js.core
  (:require [rerenderer.primitives :as p]
            [rerenderer.core :refer [init!]]))

(enable-console-print!)

(defn wrap
  [cmp]
  (fn [props & childs]
    (apply cmp (js->clj props :keywordize-keys true)
           childs)))

(defn component
  [cmp props & childs]
  (apply cmp props childs))

(defn init
  [data]
  (let [{:keys [rootView eventHandler state canvas]} (js->clj data :keywordize-keys true)]
    (println (js->clj data :keywordize-keys true))
    (init! :root-view rootView
           :event-handler eventHandler
           :state state
           :canvas canvas)))
