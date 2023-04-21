(ns euler.level1.problem003)

(defn is-factor-of [n m]
  (= 0 (mod m n)))

(defn largest-prime-fac [n]
  (loop [n                n
         largest-prime    1
         possible-factors (iterate inc 2)]
    (if (= n 1)
      largest-prime
      (let [possible-factor (first possible-factors)]
        (recur
          (if (is-factor-of possible-factor n) (/ n possible-factor) n)
          (if (is-factor-of n possible-factor) possible-factor largest-prime)
          (filter #(not (is-factor-of (first possible-factors) %)) possible-factors))))))
