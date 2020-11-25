list = [1,2,3,4,5]
puts list.sort
puts list.any? {|i| i> 6}
puts list.all? {|i| i> 6}
puts list.collect {|i| i * 2} # 对每一元素进行此操作
puts list.select {|i| i > 2} # 收集符合这个条件的元素
puts list.member?(2) # 存在一个2

puts list.inject {|sum,i| sum * i} # 求乘积