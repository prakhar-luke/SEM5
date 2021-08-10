

object lab04_q01 {
  //Write a function in scala that takes two numbers as parameters and returns the
  //Maximum and Minimum of them. (Use Single Nested Function)
  
  def main(args:Array[String]){
    println("Min and Max from 5, 7 ",maxAndMin(5,7));
  }
  def maxAndMin(a:Int, b:Int)={
    //nested function
    def maxValue()={
      if(a>b){
        println("Max is: " +a)
      }
      else {
        println("Max is: " +b)
      }
    }
    
    //nexted function
    def minValue()={
      if(a<b){
        println("Min is: "+a)
      }
      else{
        println("Min is: "+b)
      }
    }
    maxValue();
    minValue();
  }
}