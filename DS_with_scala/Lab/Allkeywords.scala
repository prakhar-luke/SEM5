import java.util
object Allkeywords {
  def main(args: Array[String]){
    try{
      val v1 = true
      val v2 = 34
      val v3 = 23.32f
      val v4 = 23.1234242d
      val v5 = 'V'
      val v6 = "Hello String here"
      var NumberOfOpinionMatter = null
      var i=0
      for(i <- 1 to 5){
        printf(i+" is ")
        if (i%2==0){
          printf("even")
        }
        else {
          printf("odd")
        }
      println()
      }
      while (i<7){
        printf("now value of i is", i)
      }
    }
    catch{
      case x: ArithmeticException =>{
        println("Math again !")
      }
    }
  }
}