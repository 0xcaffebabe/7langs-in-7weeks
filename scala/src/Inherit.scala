object Inherit extends App{
  class Father(val name: String){
    def say = println("i am f")
  }
  class Son(override val name: String, val age: Int) extends Father(name){
    override def say: Unit = {
      super.say
      println("i am s")
    }
  }
  new Son("cx",1).say
}
