(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  ; this is the number of cars generated per hour ignoring success
  (def base_rate (* 221.0 speed))
  (def success_rate 
    (cond (< speed 5) 1.0
          (< speed 9) 0.9
          (< speed 10) 0.8
          (= speed 10) 0.77
          :else      0.0
      ))
  (* base_rate success_rate)
  )

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
    (int (/ (production-rate speed) 60))
  )
