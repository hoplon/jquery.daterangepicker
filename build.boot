(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces               "0.1.12"        :scope "test"]
                  [cljsjs/jquery-daterange-picker "0.0.5-2"]
                  [hoplon                         "6.0.0-alpha10"]
                  [hoplon/boot-hoplon             "0.1.10"]
                  [org.clojure/clojure            "1.7.0"]])

(require
  '[adzerk.bootlaces :refer :all]
  '[hoplon.boot-hoplon :refer [hoplon]])

(def +version+ "0.0.5-0")
(bootlaces! +version+)

(task-options!
 pom  {:project     'hoplon/jquery-daterange-picker
       :version     +version+
       :description "Hoplon wrapper for jquery-daterange-picker"
       :url         "https://github.com/longbill/jquery-date-range-picker"
       :scm         {:url "https://github.com/cljsjs/packages/tree/master/jquery-daterange-picker"}
       :license     {"EPL" "http://opensource.org/licenses/eclipse-1.0.php"}}
 hoplon {:manifest true})
