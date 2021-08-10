

object lab04_q03 {
  //Write a program in scala to check the number is even or odd(Single Nested Function)
  def main(args:Array[String]){
    val num = scala.io.StdIn.readInt();
    print("Number is : ");
    checkEvenOdd(num);
  }
  def checkEvenOdd(n:Int)={
    var ans = -1
    def checkEven()={
      if(n%2==0){
        ans = 1
      }
    }
    def checkOdd()={
      if(n%2 != 0){
        ans = 0
      }
    }
    checkEven();
    checkOdd();
    if(ans == 1){
      print("Even");
    }
    else {
      print("Odd");
    }
  }
}