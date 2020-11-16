object CollectionFunctions extends App{
  val list = List(1,2,3)
  println(list.isEmpty)
  println(list.length)
  println(list.size)
  println(list.head)
  println(list.tail) // 返回去除第一个元素的list
  println(list.last)
  println(list.init) // 返回去除最后一个元素的list
  println(list.reverse) // 都不会修改原列表
  println(list.drop(1))
  println(list.count(i => i >= 2)) // 计算符合条件的元素个数
  println(list.filter(i => i >=2)) // 将符合条件的元素拿出来
  println(list.map(i => i *2))
  println(list.exists(i => i > 2)) // 是否存在这一的一个元素
  println(list.sortWith((a,b) => a > b))
  println((0 /: list){(sum, i) => sum+i}) // 从初始值0开始累加
  println(list.foldLeft(0)((sum,i) => sum + i))
  list.foreach(i => println(i))

  val map = Map("name" -> "cxk", "age" -> 18)
  map.foreach(entry => println(entry._1 + entry._2))
}
