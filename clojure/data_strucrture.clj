;(println (1,2,3)) ; 错误
(println (list 1 2 3)) ; 生成一个列表
; 列表操作
(println (first (list 1 2 3)))
(println (last (list 1 2 3)))
(println (rest (list 1 2 3))) ; 除头元素

; 向量
(println [1 2 3])
(println (first [1 2 3]))
(println (nth [1 2 3] 2))
(println (last [1 2 3]))
(println ([1 2 3] 2)) ; 向量也是一个函数 可以执行参数为2

; 集合
(println #{1 2 3})
(def s #{1 2 3}) ; 集合赋值
(println (count s))
(println (sort s))
(println (sorted-set 3 1 2)) ; 创建一个有序集合
(println s 2) ; 判断元素是否在集合中

; 映射表
(def suffix {"js" "javascript", "py" "python", "java" "java"})
(println (suffix "js"))
(println (merge {"js" 1, "java" 1} { "py" 1, "java" 1})) ; 合并 重复直接覆盖
(println (merge-with + {"js" 1, "java" 1} { "py" 1, "java" 1})) ; 合并 提供一个操作当重复时执行该操作
(println (assoc {"js" 1} "java" 1)) ; 增加KV