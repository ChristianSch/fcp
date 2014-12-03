(ns blatt7.aufgabe3)

; Wir betrachten Rechtecke in der euklidischen Ebene, deren
; linke untere Ecke am Punkt (0,0) liegt. Ein solches Rechteck
; wird durch die rechte obere Ecke (x,y) eindeutig be- stimmt.

; a) Wie kann man Rechtecke in Clojure repräsentieren?
; Schreiben Sie eine Funktion (rectangle x y), die ein Rechteck
; „erzeugt“.

(defn rectangle [x y]
  ^{:type :rectangular} [x y])

(type (rectangle 1 1)) ; => :rectangular

; b) Gegeben ein Rechteck rectangle, schreiben Sie Funktionen für die Bestimmung
; • der Höhe (height rectangle)
; • der Breite (width rectangle)
; • der Fläche (area rectangle)
(defn height [rect]
  (first rect))

(defn width [rect]
  (second rect))

(defn area [rect]
  (* (first rect) (second rect)))
(area (rectangle 1 1)) ; => 1
(area (rectangle 1.5 1.5)) ; => 2.25
