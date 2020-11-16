object PatternMatch extends App {
  def switch(i: String): String = i match {
    case "1" => "one"
    case "2" => "two"
    case _ => "none"
  }
  println(switch("1"))
  println(switch("ss"))
}
