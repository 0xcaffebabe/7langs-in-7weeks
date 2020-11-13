object Reg extends App {
  val reg = """\w""".r // 创建一个正则
  println(reg.findFirstIn("i am your"))
}
