object Singleton extends App {
  object singleton { // 单例对象
    def print = println("he") // 类方法
  }
  singleton.print
}
