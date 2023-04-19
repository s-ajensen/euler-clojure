(ns euler.level1.problem002)

(defn even-fib
  ([] (even-fib 2 8))
  ([n m] (lazy-seq (cons n (even-fib m (+' n (* 4 m)))))))

(defn euler-2 [n]
  (reduce + (take-while #(> n %) (even-fib))))