(ns aufgabe4)

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
  (+ (* 4 x) 2))

(f1 0)
(f1 2)
(f1 -2)

; (b)
(defn f2 [x]
  (+ (pow (* 9 x) 3) ; 9x^3
     (pow x 2) ; x^2
     (* 7 x) ; 7x
     -3 ; -3
  ))
(f2 1)

; (c)
(defn f3 [x]
  (+ (- (pow (* 3 x) 2)) ; -3x^2
     (* -4 x) ; -4x
     1))
(f3 1)
(f3 5)
