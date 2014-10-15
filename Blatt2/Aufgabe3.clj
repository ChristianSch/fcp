; not thought for execution
stop

10 ; 10
(+ 5 3 2) ; 10
(- 9 1) ; 8
(/ 6 2) ; 3
(/ 7 2) ; 7/2
(/ 8 6) ; 4/3
(+ (* 2 4) (- 4 6)) ; 6
(def a 3) ; a=>3
(def b (+ a 1)) ;b=>4
( + a b (* a b)) ; 19
(= a b) ; false
(if (and (> b a) (< b (* a b))) b a) ; 4

(cond
 (= a 4) 6
 (= b 6) (+ 6 7 a)
 :else 25) ; 25

