true clone println // itself
Vehicle := Object clone
Vehicle clone := Vehicle # 创建自己的单例
(Vehicle clone == Vehicle clone) println