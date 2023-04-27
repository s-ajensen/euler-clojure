(ns euler.math)

(defn square [n]
  (*' n n))

(defn squares
  ([] (squares 1))
  ([n] (lazy-seq (cons (+' (square n)) (squares (inc n))))))