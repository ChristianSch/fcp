(ns aufgabe1)

stop

; (a)
; Rufen Sie folgende Funktion in der REPL mit Ihrem Namen auf:
((fn [name] (str "Hallo " name)) "Christian")

; (b)
; Rufen Sie folgende Funktion in der REPL mit Ihrem Namen auf:
(#(str "Hallo " %) "Christian")

; (c)
; Geben Sie der Funktion aus (a) den Namen hallo und rufen Sie sie dann mit
; Ihrem Namen auf.
(def hallo (fn [name] (str "Hallo " name)))
(hallo "Christian")

; (d)
; Geben Sie der Funktion aus (b) den Namen hallo und rufen Sie sie dann mit Ihrem Namen auf
(def hallo #(str "Hallo " %))
(hallo "Christian")

; (e)
(defn hallo [name]
  "Begrueßt den uebermittelten Nutzer"
  (str "Hallo " name))
(hallo "Christian")
