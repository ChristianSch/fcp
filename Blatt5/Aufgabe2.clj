(ns aufgabe2)

(defn gcd
  "Finds greatest common divisor"
  [a,b]
  (if (= b 0)
     a
      (gcd b (mod a b))))

(gcd 10 15)
