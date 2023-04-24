(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (it "should identify palindromes"
    (should= true (is-palindrome 11))
    (should= false (is-palindrome 12))
    (should= true (is-palindrome 121))
    (should= false (is-palindrome 122)))

  (it "should find largest palindrome from products of n-digits nums"
    (should= 9009 (palindrome-product 2))
    (should= 906609 (palindrome-product 3))))

(run-specs)
