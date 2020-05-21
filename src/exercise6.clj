(ns exercise6)

(defn calculate-average [x]
  (def sum-result
    (reduce + x))
  (/ sum-result (count x)))

(defn faverage
  "Calculates the average of a given sequence."
  [x]
  (if-not (empty? x)
    (calculate-average x)
    0)
)




