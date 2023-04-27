(ns euler.level1.problem006
  (:use
    [euler.math]))

(defn sum-squares [n]
  (reduce +' (take n (squares))))

(defn square-sums [n]
  (square (reduce +' (take n (iterate inc 1)))))

(defn euler-6 [n]
  (- (square-sums n) (sum-squares n)))
