(defproject uk.org.russet/tawny-protege "1.1.0-SNAPSHOT"
  :description "Link between Tawny-OWL and Protege"
    :license {:name "LGPL"
            :url "http://www.gnu.org/licenses/lgpl-3.0.txt"
            :distribution :repo}
  :url "https://github.com/phillord/tawny-protege"
  :scm {:url "https://github.com/phillord/tawny-protege"
        :name "git"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [edu.stanford.protege/org.protege.editor.core.application
                  "5.0.0-beta-05-SNAPSHOT"]
                 [edu.stanford.protege/org.protege.editor.owl
                  "5.0.0-beta-05-SNAPSHOT"]
                 [uk.org.russet/tawny-owl "1.1.0-SNAPSHOT"]
                 [uk.org.russet/nrepl-clojure "1.1.0-SNAPSHOT"]])
