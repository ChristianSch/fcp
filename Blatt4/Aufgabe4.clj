; (a)
(defn solve-quadratic
  "Berechnet Loesungen einer quadratischen Gleichung anhand der gegebenen Koeffizienten"
  [a,b,c]
  (let [cnt (solution-count a b c)]
  (cond (< cnt 0) (vector)
        (= cnt 2) (vector (/ (+ (- b) (Math/sqrt  (- (* b b) (* 4  a c)))) (* 2 a))
                         (/ (- (- b) (Math/sqrt  (- (* b b) (* 4  a c)))) (* 2 a)))
        ; hier ist es egal ob b + oder - die quadratwurzel, weil beide gleich sind
        :else (vector (/ (+ (- b) (Math/sqrt  (- (* b b) (* 4  a c))) (* 2 a)))))))

; (b) Zahl der Loesungen einer quadratischen Gleichung
(defn solution-count
  "Berechnet Zahl der Lösungen zu einer quadratischen Gleichung"
  [a,b,c]
  (let [D (- (* b b) (* 4 a c))]
    (cond (pos? D) 2 ; 2 Loesungen
          (neg? D) 0 ; keine reelle Loesung
          :else 1))) ; 1 reelle Loesung

(solve-quadratic 4 -12 -40)
(solution-count 4 -12 -40)
