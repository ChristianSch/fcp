(ns aufgabe3)

; [Aufgabe 1.34 in SICP] Gegeben sei die Funktion (defn f [g] (g 2))
(defn f [g] (g 2))

;(a) Was ergeben folgende Beispiele?
(f #(* % %)) ; => 4
(f (fn [z] (* z (inc z)))) ; => 6

;(b) Was passiert, wenn wir (f f) auswerten lassen? Genaue Erklärung?
(f f) ; Long cannot be cast to clojure lang …
; => f soll auf 2 angewandt werden, alledings ist f
; in dem fall auch 2. es wird versucht 2 als funktion
; auszuwerten, was fehl schlägt
