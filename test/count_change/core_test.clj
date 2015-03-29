(ns count-change.core-test
  (:require [clojure.test :refer :all]
            [count-change.core :refer :all]))

(deftest a-test
  (testing "10 cents can be changed 3 with nickels and pennies"
    (is (= 3 (count-change 10 [5 1]))))
  (testing "dollar can be changed 292 ways"
    (is (= 292 (count-change 100 [50 25 10 5 1])))))
