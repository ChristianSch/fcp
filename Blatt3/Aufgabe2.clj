(ns aufgabe2)

; Definieren Sie folgende Funktionen und machen Sie in der
; REPL einige Beispiele für die Verwendung der definierten Funktionen:

;  square mit x􏰀 → x × x
(defn square [x]
  "Quadriert die uebergebene Zahl"
  (* x x))
(square 2) ; => 4
(square -1) ; => 1

; sum-of-squares mit (x,y)􏰀 → x × x + y × y
(defn sum-of-squares [x,y]
  "Summiert die Quadrate der uebergebenen Werte"
  (+ (* x x) (* y y)))
(sum-of-squares 2 3)
(sum-of-squares 1 1)

; eval-test mit (x, y) 􏰀→ x × x
(defn eval-test
  [x,y]
  (* x x))
(eval-test 2 3)
(eval-test 1 100)
