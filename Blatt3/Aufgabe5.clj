(ns aufgabe5)

(defn pow [x,n]
  "calculates x^n"
  (cond (= n 0) 1
        (= n 1) x
        :else (* x (pow x (dec n)))))
(pow 1 10)
(pow 10 2)
(pow 1000 0)
(pow 10000 1)

; (a)
(defn f1 [x]
  (+ (* 4 x) 2)) ; 4x + 2

(map f1 [0 2 -2])

; (b)
(defn f2 [x]
  (+ (* 9 (pow x 3)) ; 9x^3
     (pow x 2) ; x^2
     (* 7 x) ; 7x
     -3 ; -3
  ))

(map f2 [0 2 -2])

; (c)
(defn f3 [x]
  (+ (- (* 3 (pow x 2))) ; -3x^2
     (* -4 x) ; -4x
     1))

(map f3 [0 2 -2])
