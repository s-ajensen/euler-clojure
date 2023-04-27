(ns euler.level1.problem006)

(defn square [n]
  (*' n n))

(defn squares
  ([] (squares 1))
  ([n] (lazy-seq (cons (+' (square n)) (squares (inc n))))))

(defn sum-squares [n]
  (reduce +' (take n (squares))))

(defn square-sums [n]
  (square (reduce +' (take n (iterate inc 1)))))

(defn euler-6 [n]
  (- (square-sums n) (sum-squares n)))
