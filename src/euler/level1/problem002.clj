(ns euler.level1.problem002)

(defn even-fib
  ([] (even-fib 1 1))
  ([n m] (filter even? (lazy-seq (cons n (even-fib m (+' n m)))))))