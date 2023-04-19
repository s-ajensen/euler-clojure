(ns euler.level1.problem001
  (:require [clojure.set :as set]))

(defn get-multiples [n max]
  (loop [m          n
         multiples  #{}]
    (if (>= m max)
      multiples
      (recur (+ m n) (conj multiples m)))))

(defn sum-multiples [n max]
  (let [multiples (reduce set/union (map #(get-multiples % max) n))]
    (reduce + multiples)))

(defn euler-1 [n]
  (sum-multiples [3 5] n))
