(ns aufgabe1)

; a) Schreiben Sie eine Funktion, die von einer Zahl 2 abzieht,
; ohne dass das Zeichen - im Code auftaucht
(def dec-two (comp dec dec))

; test
(dec-two 0)
(dec-two 2)

; b) Schreiben Sie eine Funktion sqplus, die eine Zahl um 1 erhöht
; und dann quadriert. Im Code darf + nicht vorkommen.
(defn sq [x] (* x x))
(def sqplus (comp sq inc))

; test
(sqplus 4)
(sqplus 0)
