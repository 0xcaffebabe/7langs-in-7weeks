(defn center [[_ c _]] c)
(println (center [1,2,3])) ; 2

(println (let [[_ c _] [1 2 3]] c)) ;2