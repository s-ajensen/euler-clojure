(ns euler.level1.problem004)

(defn as-digits [num]
  (loop [n      num
         digits '()]
    (if (< n 10)
      (cons (rem n 10) digits)
      (recur (quot n 10) (cons (rem n 10) digits)))))

(defn shrink [n coll]
  (drop n (drop-last n coll)))

(defn is-palindrome [num]
  (loop [digits        (as-digits num)
         is-palindrome true]
    (if (not (and (< 1 (count digits)) is-palindrome))
      is-palindrome
      (recur (shrink 1 digits) (= (first digits) (last digits))))))

(defn pow [n m]
  (reduce * (repeat m n)))

(defn palindrome-product [n]
  (let [max-multiplicand (- (pow 10 n) 1)
        products         (for [x (range max-multiplicand 1 -1)
                               y (range max-multiplicand 1 -1)]
                           (* x y))]
    (first (sort > (filter is-palindrome products)))))