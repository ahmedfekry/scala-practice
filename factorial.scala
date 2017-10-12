object factorial{
  def main(args: Array[String]): Unit = {
  	def fact(n:Int): Int = {
     var n = 5
      var result: Int = 1
      while(n >= 1){
        result *= n
        n-=1
      }
      return result
    }
    
    def factRecursivly(n:Int): Int = {
      if(n==1)
      	return n
      
      return n * factRecursivly(n-1)
    } 
    println(fact(5))
    println(factRecursivly(5))
  }
}