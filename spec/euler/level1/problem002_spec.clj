(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "should return first even fib number"
    (should= [2] (take 1 (even-fib))))

  (it "should return vec containing first two even fib numbers"
    (should= [2 8] (take 2 (even-fib))))

  (it "should return vec containing first three even fib numbers"
    (should= [2 8 34] (take 3 (even-fib)))))

(run-specs)
