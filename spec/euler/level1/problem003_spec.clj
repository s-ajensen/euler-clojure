(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

  (it "should return the first prime number"
    (should= 2 (largest-prime-fac 2)))

  (it "should return largest prime factor of 6"
    (should= 3 (largest-prime-fac 6)))

  (it "should return largest prime factor of 55"
    (should= 11 (largest-prime-fac 55)))

  (it "should return largest prime factor of 13195"
    (should= 29 (largest-prime-fac 13195)))

  (it "should solve Euler #3"
    (should= 6857 (largest-prime-fac 600851475143))))

(run-specs)
