(ns aufgabe6)

(def p
  (fn p [] (p)))

(defn test [x,y]
  (cond (= x 0) 0
    :else y))

(test 0 (p))
