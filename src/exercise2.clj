(ns exercise2)

(defn only-greater-than-five
  "Filters the input list returning only the elements greater than 5."
  [x]
  (let [greater-than-five (fn [y] (> y 5))]
    (filter greater-than-five x))
)




