(ns aufgabe3)

; (a) Ein Tagesgeldkonto wirft 2% Zinsen bei einem Kontostand unter 3000 Euro ab
; und darüber 3%. Schreiben Sie eine Funktion, die abhängig vom Kontostand den
; Zinssatz zurückgibt.
(defn zinsen
  "Gibt abhängig vom Kontostand die entsprechenden Zinsen aus"
  [kontostand]
  (cond (< kontostand 3000)
        0.02
  :else 0.03))

; # test
(zinsen 2999)
(zinsen 3000)

; (b) Schreiben Sie darauf aufbauend eine Funktion, die den Zinsbetrag bei
; jährlicher Zinszahlung ermittelt.
(defn zins-ertrag
  ""
  [kontostand, jahre]
  (cond (= jahre 0)
        kontostand
  :else (zins-ertrag
         (+ kontostand (* kontostand (zinsen kontostand)))
         (dec jahre))))

; # tests

; zinsen fuer jahr 1
(* 3000 0.03)

; kontostand nach jahr 1
(zins-ertrag 3000 1)


; zinsen fuer jahr 2
(* 3090 0.03)

; kontostand nach jahr 2
(zins-ertrag 3000 2)


; zinsen fuer jahr 3
(* 3182.7 0.03)
(+ 3182.7 95.481)

; kontostand nach jahr 3
(zins-ertrag 3000 3)
