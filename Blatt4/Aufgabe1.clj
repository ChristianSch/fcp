(ns aufgab1)

; (a) Schreiben Sie eine Funktion minimum, die als Ergebnis die kleinere
; der beiden Zahlen hat. (Verwenden Sie dabei nicht die Clojure-Funktion min.)
(defn minimum
  "Finds smallest number of the two"
  [a,b]
  (cond (<= a b) a
  :else b))

; tests
(minimum 1 2)
(minimum 2 1)

; (b) Vergleichen Sie ihre Funktion mit der Clojure-Funktion min.
;
; Source: https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L1084
;
; Original-Code:
(defn min
  "Returns the least of the nums."
  {:added "1.0"
   :inline-arities >1?
   :inline (nary-inline 'min)}
  ([x] x)
  ([x y] (. clojure.lang.Numbers (min x y)))
  ([x y & more]
   (reduce1 min (min x y) more)))

; * (.clojure.lang.Numbers …) ruft eine Java-Implementierung von min mit 2 doubles auf:
;
; Source: https://github.com/clojure/clojure/blob/master/src/jvm/clojure/lang/Numbers.java#L4035
;
; static public double min(double x, double y){
;	    return Math.min(x, y);
; }
;
; Wenn mehr als 2 Parameter uebergeben werden, wird mit recude1
; (Source: http://www.clodoc.org/doc/clojure.core/reduce1) die Liste
; reduziert mit min, in dem Schrittweise das bisherige Minimum mit
; dem nächsten Wert der List verglichen wird.
