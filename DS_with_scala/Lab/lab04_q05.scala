

object lab04_q05 {
  /*
   * Practice few inline or first class functions for below scenarios :
			a. Adding one to an integer value
			b. Check integer value is 0 or not
			c. Add,multiply two numbers 
   */
  def main(args:Array[String]){
    val n1 = scala.io.StdIn.readInt();
    var ans1 = (n1:Int)=> n1+1
    println("On adding 1 = ",ans1(n1));
    
   val n2 = scala.io.StdIn.readInt();
   var ans2 = (n2:Int)=> {if(n2==0) println("value is 0") else printf("value is not 0")}
   ans2(n2)
    
    val n3 = scala.io.StdIn.readInt();
    val n4 = scala.io.StdIn.readInt();
    var ans3a = (n3:Int, n4:Int)=> (n3+n4)
    var ans3b = (n3:Int, n4:Int)=> (n3*n4)
    println("SUM = ",ans3a(n3,n4));
    println("MULTIPLE = ",ans3b(n3,n4)); 
  }
}