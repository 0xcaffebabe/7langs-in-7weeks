object Trait extends App{
  trait Part {
    def say = println("i am say")
  }
  class Person extends Object with Part{}
  new Person().say
}
