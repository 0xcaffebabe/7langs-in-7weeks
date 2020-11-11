object Class extends App{
  class User(username: String, password: String) // pojo类
  class UserService {
    val user = new User("cxk", "123")
    def printUser(){
      println(user)
    }
  }
  new UserService().printUser
}
