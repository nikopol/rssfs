(ns rssfs.logger
   (:require [clojure.string :as str]))


(def ^{:const true} level-values {:debug 0 
                                  :info 1
                                  :warn 2
                                  :error 3})

(def current-level (atom (:info level-values)))

(defn set-level!
  [new-level]
  (if (contains? level-values new-level)
    (reset! current-level (new-level level-values))))

(defn log
  [level text]
  (when (and (contains? level-values level)
           (<= @current-level (level level-values)))
    (.println *err* text)))

(defn debug
  [& args]
  (log :debug (apply str args)))

(defn info
  [& args]
  (log :info (apply str args)))

(defn warn
  [& args]
  (log :warn (apply str args)))

(defn error
  [& args]
  (log :error (apply str args)))
