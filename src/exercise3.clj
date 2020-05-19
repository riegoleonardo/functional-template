(ns exercise3)

(defn fibonacci
  "Calculates the fibonacci result fo the given input value."
  [x]
  (loop [counter x current 1 previous 1]
    (cond
      (= 0 x) 0
      (<= counter 2) current
      :default (recur (dec counter) (+ current previous) current)))
)