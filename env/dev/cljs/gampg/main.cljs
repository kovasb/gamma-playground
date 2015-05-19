(ns gampg.main
  (:require [gampg.core :as core]
            [figwheel.client :as figwheel :include-macros true]
            [cljs.core.async :refer [put!]]
            [clojure.browser.repl :as repl]
    ;[weasel.repl :as weasel]
            ))

(enable-console-print!)

(figwheel/watch-and-reload
  :websocket-url "ws://localhost:3449/figwheel-ws"
  :jsload-callback (fn []
                     (core/main)))

(comment
  (defonce conn
          (repl/connect "http://localhost:3449/repl")))

;(weasel/connect "ws://localhost:9001" :verbose true :print #{:repl :console})

(core/main)
