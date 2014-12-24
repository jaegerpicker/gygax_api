(defproject gygax_api "0.1.0-SNAPSHOT"
  :description "A api for codename gygax RPG tools"
  :url "http://api-rpg.teamawesomepants.com/"
  :ring {:handler gygax-api.core/handler}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "1.0.1"]
                 [compojure "1.1.8"]
                 [ring/ring-core "1.2.1"]
                 [ring/ring-json "0.3.1"]
                 [com.ashafa/clutch "0.4.0"]
                 [liberator "0.10.0"]]
  :plugins [[cider/cider-nrepl "0.8.1"] [lein-ring "0.8.11"]])
