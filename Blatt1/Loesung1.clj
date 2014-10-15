(ns fpc.ul01
  (:require [clojure.repl :refer :all]))


; Übung 1.4

; Beispiel aus der Vorlesung
(apply + (range 1 11))

; Documentation for the `range` function.
(doc range)

; Documentation for the `+` function
(doc +)

; Documentation for the `apply` function
(doc apply)

(source range)

; Search documentation containing or documenting the
; given regular expression
(find-doc "range")

; Search for definitions matching the regular expression "ran" in
; the currently loaded namespace. Returns a sequence of matches.
(apropos "ran")

; Given a regular expression or stringable thing, return a seq of
; all definitions in all currently-loaded namespaces that match the
; str-or-pattern.
(doc apropos)

; Prints documentation for any var whose documentation or name
; contains a match for re-string-or-pattern
(doc find-doc)
