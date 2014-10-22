; Ausdrücke in der Präfix-Notation
; Schreiben Sie folgende Ausdrücke in der Präfix-Notation:

; (a) 2 + 3 + 1
;
; + + 2 3 1
;
; in Clojure:
(+ (+ 2 3) 1)

; (b) 2 * 3 + 4
;
; + * 2 3 4
;
; in Clojure:
(+ (* 2 3) 4)

; (c) 2 * (3 + 4)
;
; * 2 + 3 4
;
; in Clojure:
(* 2 (+ 3 4))

; (d) true and false or true
;
; or and true false true
;
; in Clojure:
(or (and true false) true)

; (e) square(7) - 7
;
; - square(7) 7

; (f) (1 = 1) or (1 != 1)
;
; or = 1 1 != 1 1
;
; in Clojure:
(or (= 1 1) (not= 1 1))

; (g) (3 + 4) * (2 + 5)
;
; * + 3 4 + 2 5
;
; in Clojure:
(* (+ 3 4) (+ 2 5))
