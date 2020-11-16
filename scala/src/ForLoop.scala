object ForLoop extends App {
  for(i <- args.indices){
    println(args(i))
  }
  args.foreach(str => println(str)) // 函数式
}
