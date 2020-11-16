object Range extends App {
  val r1 = 1 to 10 by 2 // 步长为2
  val r2 = 1 to 10 // 步长为1
  val r3 = 1 until 10 by 2 // 步长为2 不包括10
  println(r1)
  println(r2)
  println(r3)
}
