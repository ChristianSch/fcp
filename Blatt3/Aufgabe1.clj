stop
; Rufen Sie folgende Funktion in der REPL mit Ihrem Namen auf:
((fn [name] (str "Hallo " name)) "Christian")


; Rufen Sie folgende Funktion in der REPL mit Ihrem Namen auf:
(#(str "Hallo " %) "Christian")

; Geben Sie der Funktion aus (a) den Namen hallo und rufen Sie sie dann mit
; Ihrem Namen auf.
(defn hallo [name] (str "Hallo " name))
(hallo "Christian")

; Geben Sie der Funktion aus (b) den Namen hallo und rufen Sie sie dann mit Ihrem Namen auf
; TODO: geht nicht. wie ist das gemeint?
; (def hallo (str "Hallo " %))

(defn hallo "Begrueßt den uebermittelten Nutzer" [name] (str "Hallo " name))
(hallo "Christian")

