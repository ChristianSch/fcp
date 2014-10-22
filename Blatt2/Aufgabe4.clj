; (a) Wie kann man die Liste (+ 2 3) als eine Liste von Werten behandeln?

'(+ 2 3)

; (b) Und wie kann man eine Liste (als Daten) mit den Elementen +, 2 und 3 als Code ausfuehren?

'(+ 2 3)

; oder
(quote (+ 2 3))

(def l '(+ 2 3))

; und ausfuehren:
(eval l)
