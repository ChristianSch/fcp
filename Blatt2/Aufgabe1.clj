; Abstrakter Syntaxbaum von Infix-Ausdrücken
; Zeichnen Sie zu folgenden Ausdrücken den abstrakten Syntaxbaum:

; (a) Syntaxbaum zu `2 + 3 + 1`
;
;     +
;    / \
;   +   1
;  / \
; 2   3

; (b) Syntaxbaum zu `2 * 3 + 4`
;
;     +
;    / \
;   *   4
;  / \
; 2   3

; (c) Syntaxbaum zu `2 * (3 + 4)`
;
;   *
;  / \
; 2   +
;    / \
;   3   4

; (d) Syntaxbaum zu `true and false or true`
;       or
;      /  \
;    and  true
;   /   \
; true false

; (e) Syntaxbaum zu `square(7) - 7`
;           -
;         /   \
;  square(7)   7

; (f) Syntaxbaum zu `(1 = 1) or (1 != 1)`
;
;      or
;    /    \
;   =     !=
;  / \    / \
; 1   1  1   1

; (g) Syntaxbaum zu `(3 + 4) * (2 + 5)`
;
;      *
;    /   \
;   +     +
;  / \   / \
; 3   4 2   5
