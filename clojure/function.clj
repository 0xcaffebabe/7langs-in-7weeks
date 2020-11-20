(defn say [] (println "hello world")) ; 定义
(say)

; 匿名函数
(println (map (fn [i] (* i i)) [1 2 3]))

; apply
(defn kiss [man] (println "kiss" man))
(apply kiss '("people")) ; 调用指定函数使用指定参数

; filter
(defn gt2 [i] (> i 2))
(println (filter gt2 [1 2 3])) ; 使用指定函数过滤元素