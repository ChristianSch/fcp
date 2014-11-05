(ns aufgabe2)

(defn max-quad
  "Gibt die Summe der Quadrate der größeren beiden Zahlen aus"
  [x,y,z]
  (let [a (max x y)
        b (max y z)]
    (+ (* a a)
       (* b b))))

(max-quad 1 2 2)
(max-quad 7 2 2)
(max-quad 12 12 12)
(max-quad 0 0 0)
(max-quad 0 1 1)
(max-quad 0 1 2)
