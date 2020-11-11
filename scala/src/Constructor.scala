object Constructor extends App{

  class User(username: String){
    def this(username: String, password: String){
      this(username)
      println(password)
    }
  }
}
