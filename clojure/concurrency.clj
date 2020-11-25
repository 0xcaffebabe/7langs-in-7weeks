; 引用
(def name (ref "cxk")) ; 定义
(println @name) ; 使用
(dosync (ref-set name "jntm")) ; 只能在事务(dosync)里面修改
(println @name)

; 原子
(def person (atom "电影人")) ; 定义
(println person)
(reset! person "打工人") ; 设置新原子
(println person)

; 代理
(defn calc [x] (* 2 2))
(def proxy (agent 1))
(send proxy calc) ; 让代理去调用函数
(println @proxy) ; 这里读取会很快返回 即使calc函数阻塞

; future 基本跟代理一样
(def result (future (Thread/sleep 1000) "got it"))
(println @result) ; 只有结果返回才能获取 否则就阻塞住了