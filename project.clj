(defproject rssfs "0.1.0-SNAPSHOT"
  :description "generate a rss of last file of given path[s]"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [clj-rss "0.1.9"]]
  :repl-options {:init-ns rssfs.core}
  :aot [rssfs.core]
  :main rssfs.core)
