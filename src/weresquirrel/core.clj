(ns weresquirrel.core
  (:gen-class))

(def journal
  [{:events ["carrot" "exercise" "weekend"] :squirrel false}
   {:events ["bread" "pudding" "brushed teeth" "weekend" "touched tree"] :squirrel false}
   {:events ["carrot" "nachos" "brushed teeth" "cycling" "weekend"] :squirrel false}
   {:events ["brussel sprouts" "ice cream" "brushed teeth" "computer" "weekend"] :squirrel false}
   {:events ["potatoes" "candy" "brushed teeth" "exercise" "weekend" "dentist"] :squirrel false}
   {:events ["brussel sprouts" "pudding" "brushed teeth" "running" "weekend"] :squirrel false}
   {:events ["pizza" "brushed teeth" "computer" "work" "touched tree"] :squirrel false}
   {:events ["bread" "beer" "brushed teeth" "cycling" "work"] :squirrel false}
   {:events ["cauliflower" "brushed teeth" "work"] :squirrel false}
   {:events ["pizza" "brushed teeth" "cycling" "work"] :squirrel false}
   {:events ["lasagna" "nachos" "brushed teeth" "work"] :squirrel false}
   {:events ["brushed teeth" "weekend" "touched tree"] :squirrel false}
   {:events ["lettuce" "brushed teeth" "television" "weekend"] :squirrel false}
   {:events ["spaghetti" "brushed teeth" "work"] :squirrel false}
   {:events ["brushed teeth" "computer" "work"] :squirrel false}
   {:events ["lettuce" "nachos" "brushed teeth" "work"] :squirrel false}
   {:events ["carrot" "brushed teeth" "running" "work"] :squirrel false}
   {:events ["brushed teeth" "work"] :squirrel false}
   {:events ["cauliflower" "reading" "weekend"] :squirrel false}
   {:events ["bread" "brushed teeth" "weekend"] :squirrel false}
   {:events ["lasagna" "brushed teeth" "exercise" "work"] :squirrel false}
   {:events ["spaghetti" "brushed teeth" "reading" "work"] :squirrel false}
   {:events ["carrot" "ice cream" "brushed teeth" "television" "work"] :squirrel false}
   {:events ["spaghetti" "nachos" "work"] :squirrel false}
   {:events ["cauliflower" "ice cream" "brushed teeth" "cycling" "work"] :squirrel false}
   {:events ["spaghetti" "peanuts" "computer" "weekend"] :squirrel true}
   {:events ["potatoes" "ice cream" "brushed teeth" "computer" "weekend"] :squirrel false}
   {:events ["potatoes" "ice cream" "brushed teeth" "work"] :squirrel false}
   {:events ["peanuts" "brushed teeth" "running" "work"] :squirrel false}
   {:events ["potatoes" "exercise" "work"] :squirrel false}
   {:events ["pizza" "ice cream" "computer" "work"] :squirrel false}
   {:events ["lasagna" "ice cream" "work"] :squirrel false}
   {:events ["cauliflower" "candy" "reading" "weekend"] :squirrel false}
   {:events ["lasagna" "nachos" "brushed teeth" "running" "weekend"] :squirrel false}
   {:events ["potatoes" "brushed teeth" "work"] :squirrel false}
   {:events ["carrot" "work"] :squirrel false}
   {:events ["pizza" "beer" "work" "dentist"] :squirrel false}
   {:events ["lasagna" "pudding" "cycling" "work"] :squirrel false}
   {:events ["spaghetti" "brushed teeth" "reading" "work"] :squirrel false}
   {:events ["spaghetti" "pudding" "television" "weekend"] :squirrel false}
   {:events ["bread" "brushed teeth" "exercise" "weekend"] :squirrel false}
   {:events ["lasagna" "peanuts" "work"] :squirrel true}
   {:events ["pizza" "work"] :squirrel false}
   {:events ["potatoes" "exercise" "work"] :squirrel false}
   {:events ["brushed teeth" "exercise" "work"] :squirrel false}
   {:events ["spaghetti" "brushed teeth" "television" "work"] :squirrel false}
   {:events ["pizza" "cycling" "weekend"] :squirrel false}
   {:events ["carrot" "brushed teeth" "weekend"] :squirrel false}
   {:events ["carrot" "beer" "brushed teeth" "work"] :squirrel false}
   {:events ["pizza" "peanuts" "candy" "work"] :squirrel true}
   {:events ["carrot" "peanuts" "brushed teeth" "reading" "work"] :squirrel false}
   {:events ["potatoes" "peanuts" "brushed teeth" "work"] :squirrel false}
   {:events ["carrot" "nachos" "brushed teeth" "exercise" "work"] :squirrel false}
   {:events ["pizza" "peanuts" "brushed teeth" "television" "weekend"] :squirrel false}
   {:events ["lasagna" "brushed teeth" "cycling" "weekend"] :squirrel false}
   {:events ["cauliflower" "peanuts" "brushed teeth" "computer" "work" "touched tree"] :squirrel false}
   {:events ["lettuce" "brushed teeth" "television" "work"] :squirrel false}
   {:events ["potatoes" "brushed teeth" "computer" "work"] :squirrel false}
   {:events ["bread" "candy" "work"] :squirrel false}
   {:events ["potatoes" "nachos" "work"] :squirrel false}
   {:events ["carrot" "pudding" "brushed teeth" "weekend"] :squirrel false}
   {:events ["carrot" "brushed teeth" "exercise" "weekend" "touched tree"] :squirrel false}
   {:events ["brussel sprouts" "running" "work"] :squirrel false}
   {:events ["brushed teeth" "work"] :squirrel false}
   {:events ["lettuce" "brushed teeth" "running" "work"] :squirrel false}
   {:events ["candy" "brushed teeth" "work"] :squirrel false}
   {:events ["brussel sprouts" "brushed teeth" "computer" "work"] :squirrel false}
   {:events ["bread" "brushed teeth" "weekend"] :squirrel false}
   {:events ["cauliflower" "brushed teeth" "weekend"] :squirrel false}
   {:events ["spaghetti" "candy" "television" "work" "touched tree"] :squirrel false}
   {:events ["carrot" "pudding" "brushed teeth" "work"] :squirrel false}
   {:events ["lettuce" "brushed teeth" "work"] :squirrel false}
   {:events ["carrot" "ice cream" "brushed teeth" "cycling" "work"] :squirrel false}
   {:events ["pizza" "brushed teeth" "work"] :squirrel false}
   {:events ["spaghetti" "peanuts" "exercise" "weekend"] :squirrel true}
   {:events ["bread" "beer" "computer" "weekend" "touched tree"] :squirrel false}
   {:events ["brushed teeth" "running" "work"] :squirrel false}
   {:events ["lettuce" "peanuts" "brushed teeth" "work" "touched tree"] :squirrel false}
   {:events ["lasagna" "brushed teeth" "television" "work"] :squirrel false}
   {:events ["cauliflower" "brushed teeth" "running" "work"] :squirrel false}
   {:events ["carrot" "brushed teeth" "running" "work"] :squirrel false}
   {:events ["carrot" "reading" "weekend"] :squirrel false}
   {:events ["carrot" "peanuts" "reading" "weekend"] :squirrel true}
   {:events ["potatoes" "brushed teeth" "running" "work"] :squirrel false}
   {:events ["lasagna" "ice cream" "work" "touched tree"] :squirrel false}
   {:events ["cauliflower" "peanuts" "brushed teeth" "cycling" "work"] :squirrel false}
   {:events ["pizza" "brushed teeth" "running" "work"] :squirrel false}
   {:events ["lettuce" "brushed teeth" "work"] :squirrel false}
   {:events ["bread" "brushed teeth" "television" "weekend"] :squirrel false}
   {:events ["cauliflower" "peanuts" "brushed teeth" "weekend"] :squirrel false}
   ])

(def events (fn [m] (reduce conj #{} (flatten (map :events m)))))

(def table-for
  "find :n00 :n01 :n10 and :n11 (nXY X=squirrelness Y=event happened)"
  (fn [journal event]
    (loop [[entry & rem] journal t {:n00 0 :n01 0 :n10 0 :n11 0}]
      (if (empty? entry) t
        (if (:squirrel entry)
          (if (some #{event} (:events entry))
            (recur rem
              {:n00 (:n00 t) :n01 (:n01 t) :n10 (:n10 t) :n11 (+ (:n11 t) 1)})
            (recur rem
              {:n00 (:n00 t) :n01 (:n01 t) :n10 (+ (:n10 t) 1) :n11 (:n11 t)}))
          (if (some #{event} (:events entry))
            (recur rem
              {:n00 (:n00 t) :n01 (+ (:n01 t) 1) :n10 (:n10 t) :n11 (:n11 t)})
            (recur rem
              {:n00 (+ (:n00 t) 1) :n01 (:n01 t) :n10 (:n10 t) :n11 (:n11 t)})))))))

(def phi
  (fn [journal event]
    (let [t (table-for journal event)]
      (/
        (- (* (:n00 t) (:n11 t)) (* (:n10 t) (:n01 t)))
        (java.lang.Math/sqrt (* (+ (:n10 t) (:n11 t)) (+ (:n00 t) (:n01 t))
                                (+ (:n01 t) (:n11 t)) (+ (:n00 t) (:n10 t))))))))

(def list-correlations
  "find the correlation between his activities in his journal with turning into a squirrel"
  (fn [journal]
    (loop [rem (events journal) acc {}]
      (let [x (first rem) xs (disj rem x)]
        (if (nil? x) acc
          (recur xs (conj acc {x (phi journal x)})))))))

(defn -main
  "save Jacques"
  []
  (list-correlations journal))
