(ns aufgabe1)

; (a) Summe bis n mit Rekursion
(defn simple-sum
  [n]
  (if (> n 0)
    (+ (simple-sum (dec n)) n)
    0))

(simple-sum 1)
(simple-sum 2)
(simple-sum 3)
(simple-sum 4)

; (b) Endrekursiv
(defn rec-sum
  [n]
  (loop [cnt n acc 0]
    (if (zero? cnt)
      acc
      (recur (dec cnt) (+ acc cnt)))))

(rec-sum 1)
(rec-sum 2)
(rec-sum 3)
(rec-sum 4)

(comment
  Funktionsweise von recur:
  Vorstellbar als Stack bzw. Schrittweises Aufrufen/Auswerten
  von lambda-Funktionen:
  ((fn [a,b] ( funktionsinhalt )) cnt' acc')
  ((fn [a,b] ( funktionsinhalt )) cnt'' acc'')
  ((fn [a,b] ( funktionsinhalt )) cnt''' acc''')

  usw.

  bis Abbruch vorhanden. Dann ist ganz regulär der letzte
  Ausdruck der Rueckgabewert.)

; (c) Summenbildung ohne Schleife oder Rekursion
(defn sum
  "Summe mit reduce"
  [n]
  (reduce + (range 1 (inc n))))

(sum 1)
(sum 2)
(sum 3)
(sum 4)
(sum 5)

(defn gsum
  "Gauß'sche Summe"
  [n]
  (/ (* (inc n) n) 2))

(gsum 1)
(gsum 2)
(gsum 3)
(gsum 4)
(gsum 5)
