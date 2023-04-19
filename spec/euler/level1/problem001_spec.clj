(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "Solves #1"
    (should= 23 (euler-1 10))
	(should= 233168 (euler-1 1000)))

  (it "Gets multiples up to a maximum"
      (should= #{3} (get-multiples 3 4))
      (should= #{5} (get-multiples 5 6))
      (should= #{3 6} (get-multiples 3 7))
      (should= #{3 6 9} (get-multiples 3 10))
      (should= #{5 10 15} (get-multiples 5 16)))

  (it "Sums multiples up to a maximum"
      (should= 3 (sum-multiples [3] 4))
      (should= 5 (sum-multiples [5] 6))
      (should= 18 (sum-multiples [3] 10))
      (should= 30 (sum-multiples [3] 13))
      (should= 30 (sum-multiples [5] 16)))

  (it "Should not count the same multiple twice"
      (should= 8 (sum-multiples [3 5] 6))
      (should= 45 (sum-multiples [3 5] 13))
      (should= 60 (sum-multiples [3 5] 16))))

(run-specs)
