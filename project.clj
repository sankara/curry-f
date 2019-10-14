(defproject curry-f "1.0.0"
  :description "Thoughts and notes on papers and such"
  :url "https://github.com/sankara/book-summaries"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-devel "1.7.1"]
                 [compojure "1.6.1"]
                 [ring-server "0.5.0"]
                 [cryogen-markdown "0.1.11"]
                 [cryogen-core "0.2.1"]]
  :plugins [[lein-ring "0.12.5"]]
  :main cryogen.core
  :ring {:init cryogen.server/init
         :handler cryogen.server/handler})
