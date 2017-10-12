object palindrome {
  def main(args: Array[String]): Unit = {
    
    def checkPalindrome(str: String) : Boolean = {
      if(str == str.reverse)
      	return true
      else
      	return false
    }
    
    def checkPalindrome2(str: String) : Boolean = {
      var rever = (for(i <- str.length - 1 to 0 by -1) yield str(i)).mkString
      if(str == rever)
      	return true
      else
      	return false
    }
    
    println(checkPalindrome("appa"))
    println(checkPalindrome2("appa"))
  }
}