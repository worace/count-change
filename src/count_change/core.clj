(ns count-change.core)

(defn count-change [amount coins]
  (if (= amount 0) 1
    (if (or (< amount 0) (= 0 (count coins)))
      0
      (+ (count-change amount (rest coins))
         (count-change (- amount (first coins)) coins)))))
