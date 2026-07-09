(ns triangle)

(defn equilateral?
  "Returns true if the triangle with sides a, b, and c is equilateral;
  otherwise, it returns false."
  [a b c]
  ;; function body
  (and (not= a 0) (= a b c)))

(defn isosceles?
  "Returns true if the triangle with sides a, b, and c is isosceles;
  otherwise, it returns false."
  [a b c]
  ;; function body
  (and (> (+ a b) c)
       (> (+ a c) b)
       (> (+ b c) a)
       (not= a 0)
       (not= b 0)
       (not= c 0)
       (or (= a b) (= a c) (= b c))))

(defn scalene?
  "Returns true if the triangle with sides a, b, and c is scalene;
  otherwise, it returns false."
  [a b c]
  ;; function body
  (and
   (> (+ a b) c)
   (> (+ a c) b)
   (> (+ b c) a)
   (not= a 0)
   (not= b 0)
   (not= c 0)
   (not= a b) (not= b c) (not= a c)))