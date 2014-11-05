(ns aufgabe2)

; (a) Betrachten Sie die folgende Schachtelung anonymer Funktionen:
(fn [x] ((fn [x] (+ x 1)) (+ x 2)))

; Probieren Sie mit Eingabewerten aus und machen Sie die Struktur graphisch deutlich.

; fn [x]
;   __________________________
;   |
;   | fn [x]
;   |   ----------------------
;   |   |
;   |   | (+ x 1)
;   |   |
;   |   ----------------------
;   |
;   |    ; ergibt Wert fuer x
;   |
;   |    (+ x 2)
;   |
;   --------------------------

((fn [x] ((fn [x] (+ x 1)) (+ x 2))) 1)

; (b) Wodurch unterscheidet sich die folgende Schachtelung und in welcher Beziehung
; steht sie zu Aufgabe (a)?
(fn [x] ((fn [y] (+ y 1)) (+ x 2)))

; Der Unterschied liegt in der Benennung der Variable im innersten Block. Die Funktion
; an sich ist jedoch identisch.

; fn [x]
;   ________________________
;   |
;   | fn [y]
;   |   --------------------
;   |   |
;   |   | (+ y 1)
;   |   |
;   |   --------------------
;   |
;   |   ; ergibt Wert fuer y
;   |
;   |    (+ x 2)
;   |
;   ------------------------
((fn [x] ((fn [y] (+ y 1)) (+ x 2))) 1)
