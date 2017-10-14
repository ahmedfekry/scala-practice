object functionComposition{
  def main(args: Array[String]): Unit = {
    
    def inc(x:Int): Int = {
      x+1
    }
    
    def square(x:Int): Int = {
      x*x
    }

    val h = square _ compose inc _

    println(h(6))

    println(h(7))

    println(h(3))

    println(h(2))
  }
}