import scala.collection.mutable

object Collections extends App {
  val list = List(1,2,3)
  println(list(2))
  println(list == List(1,2,3))

  val set = Set(1,2,3)
  println(set - 2) // 集合运算
  println(set + 5)
  println(set -- Set(1,2)) // 集合间运算
  println(set ++ Set(5,6))
  println(set == Set(1,2,3))

  val map = Map("name" -> "cxk","age" -> 18) // 不可变map
  println(map("name"))
  val mMap = new mutable.HashMap[String, Any] // 可变map
  mMap += "name" -> "cxk"
  mMap += "age" -> 18
}
