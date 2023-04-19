(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "should return vec containing 2 as first even fib number"
    (should= [2] (take 1 (even-fib)))))

(run-specs)
