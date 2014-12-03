(ns blatt7.aufgabe1)

; Für die folgende Aufgabe verwenden Sie bitte die Funktionen,
; die wir bisher besprochen haben. Wir werden im nächsten
; Übungsblatt sehen, dass vieles auch viel eleganter geht.

; a) Schreiben Sie eine Funktion vsquare, die aus einem Vektor
; einen anderen Vektor erstellt, der die Quadrate der Elemente
; enthält.
(defn vsquare [vec]
  (loop [n 0 acc []]
    (if (= n (count vec))
           acc
           (recur (inc n)
                  (conj acc (* (nth vec n) (nth vec n)))))))

; test
(vsquare [1 2 3 4]) ; => [1 4 9 16]

; b) Schreiben Sie eine Funktion vinc, die aus einem Vektor
; einen anderen Vektor erstellt, dessen Elemente gerade um 1
; höher sind.
(defn vinc [vec]
  (loop [n 0 acc []]
    (if (= n (count vec))
           acc
           (recur (inc n)
                  (conj acc (inc (nth vec n)))))))

; test
(vinc [1 2 3 4]) ; => [2 3 4 5]

; c) Schreiben Sie eine Funktion vmult, die die Elemente eines
; Vektors mit einer Zahl multipliziert.
(defn vmult [vec a]
  (loop [n 0 acc []]
    (if (= n (count vec))
           acc
           (recur (inc n)
                  (conj acc (* (nth vec n) a))))))

; test
(vmult [1 2 3 4] 0) ; => [0 0 0 0]
(vmult [1 2 3 4] 1/2) ; => [1/2 1N 3/2 2N]

; Schreiben Sie eine Funktion, die aus zwei Vektoren gleicher
; Länge das Skalarprodukt berechnet.
(defn vecscal [v w]
  (loop [n 0 acc []]
    (if (= n (count v))
      acc
      (recur (inc n)
             (conj acc (* (nth v n)
                          (nth w n)))))))
(vecscal [1 2 3 4] [2 2 2 2]) ; => [2 4 6 8]
(vecscal [1 2 3 4] [1 1 1 1]) ; => [1 2 3 4]
