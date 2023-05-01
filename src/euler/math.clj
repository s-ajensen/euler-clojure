(ns euler.math)

(defn square [n]
  (*' n n))

(defn squares
  ([] (squares 1))
  ([n] (lazy-seq (cons (+' (square n)) (squares (inc n))))))

(defn prime? [n]
  (nil? (first (filter #(zero? (mod n %)) (range 2 (inc (Math/floor (Math/sqrt n))))))))
