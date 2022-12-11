(ns com.github.invertisment.childproj.file
  (:require [com.github.invertisment.repro-parentproj.core :as c] ;; this works
            [com.github.invertisment.repro-parentproj.analyzer :as a] ;; this is not found, but commenting it out loads the ns and you can then jump into core.clj
            ))

#_(c/hello) ; this works when loaded
