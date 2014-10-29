(ns aufgabe3)


; TODO

; Funktion aus der vorherigen Aufgabe
(defn eval-test [x,y] (* x x))

; 1. (* 2 2)
; 2. 4
;
; verzögert: 2 schritte
; strikt: 2 schritte
(eval-test 2 3)

; 1. (* (+ 3 4) (+ 3 4))
; 2. (* 7 (+ 3 4))
; 3. (* 7 7)
; 4. 49

; verzögert: 4
; strikt: 3
(eval-test (+ 3 4) 8)

; verzögert: 3
; strikt: 4
(eval-test 7 (* 2 4))

(eval-test (+ 3 4) (* 2 4))
