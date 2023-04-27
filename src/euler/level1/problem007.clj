(ns euler.level1.problem007
  (:use
    [euler.math]))

(defn euler-7 [n]
  (last (take n (filter prime? (iterate inc 2)))))
