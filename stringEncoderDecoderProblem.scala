import scala.util.control._
object coder {
  def main(args: Array[String]) : Unit = {
    def unLengthEncode(str: String) : String = {
      var char = str(0);
      var result = ""
      var j = 1
      for(i <- 1 to str.length-1){
        if(str(i) == char){
          j = j + 1
        }else{
          result = result + char + j.toString
          char = str(i)
          j = 1
        }
      }
			result = result + char + j.toString
      return result
    }
    
    def unLengthDecode(str: String): String = {
      var char = str(0)
      var result = ""
      var numValue = ""
      val loop = new Breaks;
      //for(i <- 1 to str.length-1){
      var i = 1; 
      while(i <= str.length-1){
      	if(str(i).isDigit){
          var h = i
          numValue = numValue + str(i)
          loop.breakable {
            for(j <- h+1 to str.length-1){
              if(str(j).isDigit){
                  numValue = numValue + str(j)
                	i = i + 1 
              }else{
                loop.break;
              }
            }
          }
          var count = numValue.toInt
          for(k <- 1 to count){
            result = result + char
          }
        }else{
          char = str(i)
          numValue = ""
        }
        i = i + 1
      }
      return result
    }
    
    println(unLengthEncode("Ahmed"))
    println(unLengthDecode("A1h1m1e1d1"))
    
    println(unLengthEncode("aaaaaaaaaabbbaxxxxyyyzyx"))
    println(unLengthDecode("a10b3a1x4y3z1y1x1"))
    
    println(unLengthEncode("qqqqqqqqqqqqwwwwwwwwwwww"))
    println(unLengthDecode("q12w12"))
    
  }
}