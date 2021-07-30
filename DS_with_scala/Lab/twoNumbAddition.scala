

object twoNumbAddition {
  def main(args: Array[String]) {
    println("sum is = " + functionToAdd(400,20))
  }
  def functionToAdd(a:Int, b:Int): Int = {
    var sum:Int =0
    sum = a + b
    return sum
  }
}