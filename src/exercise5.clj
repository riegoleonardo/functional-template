(ns exercise5)

(defn flast
  "Gets the last element of a given secuence."
  [x]
  (when-not (empty? x)
    (nth x (dec (count x))))

)




