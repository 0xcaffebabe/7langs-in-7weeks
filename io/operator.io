OperatorTable addOperator("xor", 11)
true xor := method(bool, if(bool, true, false)) # 定义xor结果为true的运算函数
false xor := method(bool, if(bool, false, true)) # 定义xor结果为false的运算函数

true xor false println