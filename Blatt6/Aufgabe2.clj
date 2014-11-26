(ns aufgabe2)
; Schreiben Sie eine Funktion n-fach mit einer Funktion f und
; einer positiven ganzen Zahl n als Parameter
(defn n-fach [f n]
  (apply comp (repeat n f)))

; test
((n-fach #(* % %) 3) 5) ; => 390625
