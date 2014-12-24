(ns gygax-api.core
  (:use ring.adapter.jetty)
  (:require [liberator.core :refer [resource defresource]]
            [ring.middleware.params :refer [wrap-params]]
            [compojure.core :refer [defroutes ANY]]))

(defroutes app
  (ANY "/" [] (resource :available-media-types ["application/json"]
                           :handle-ok "{ \"message\": \"Hello you bastard!\" }")))

(def handler 
  (-> app 
      wrap-params))
