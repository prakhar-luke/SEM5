

object readLineDemo {
  def main(args: Array[String]){
    while(true){
      val result = scala.io.StdIn.readLine()
      printf("You've entered : %s", result)
      println()
    }
  }
}