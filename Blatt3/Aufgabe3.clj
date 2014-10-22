; Funktion aus der vorherigen Aufgabe
(defn eval-test [x,y] (* x x))

; 1. 2 => 2
; 2. 2 * 2 => 4
(eval-test 2 3)

; 1. 3 => 3
; 2. 4 => 4
; 3. 3 + 4 => 7
; 4. 7 * 7 => 49
(eval-test (+ 3 4) 8)

; 1. 7 => 7
; 2. 7 * 7 => 49
(eval-test 7 (* 2 4))

; 1. 3 => 3
; 2. 4 => 4
; 3. 3 + 4 => 7
; 4. 7 * 7 => 49
(eval-test (+ 3 4) (* 2 4))
