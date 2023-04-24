(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

  (it "should return the product of factors of numbers less than n"
    (should= (* 2 2 3 5) (euler-5 6))
    (should= 2520 (euler-5 10))
    (should= 232792560 (euler-5 20))))

(run-specs)
