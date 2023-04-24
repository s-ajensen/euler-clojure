(ns euler.level1.problem005)

(defn factor-out-first [multiples]
  (let [first (first multiples)]
    (next (for [x multiples]
            (if (= 0 (mod x first)) (/ x first) x)))))

(defn prime-factors-under [n]
  (loop [possible-multiples (range 2 (inc n))
         factors            '()]
    (if (nil? (next possible-multiples))
      factors
      (recur
        (factor-out-first possible-multiples)
        (conj factors (first possible-multiples))))))

(defn euler-5 [n]
  (reduce * (prime-factors-under n)))

