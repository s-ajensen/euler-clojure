(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

  (it "calculates the sum of n squares"
    (should= 1 (sum-squares 1))
    (should= 5 (sum-squares 2))
    (should= 14 (sum-squares 3))
    (should= 385 (sum-squares 10)))

  (it "calculates the square of the sum of n natural numbers"
    (should= 1 (square-sums 1))
    (should= 9 (square-sums 2))
    (should= 3025 (square-sums 10)))

  (it "calculates the difference of the square of the sums and the sum of the squares up to n"
    (should= 2640 (euler-6 10))
    (should= 25164150 (euler-6 100))))

(run-specs)
