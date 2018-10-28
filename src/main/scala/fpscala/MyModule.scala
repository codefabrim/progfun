package fpscala

import scala.annotation.tailrec

object MyModule {


  def factorial (n: Int): Int  = {
    @tailrec
    def go(n: Int, acc: Int): Int = {
      if(n <= 0) acc
      else go(n-1, acc * n)
    }
    go(n,1)
  }

  def abs(x: Int) : Int ={
    if(x >= 0) x
    else -x
  }


  private def formatAbs(x: Int)= {
    val msg = "the absolute value of %d is %d "
    msg.format(x, abs(x))
  }


  private def formatfactorial(n: Int) : String = {
    val msg = "the factorial of %d is %d ."
    msg.format(7, factorial(7))
  }


  //def formatResult(name: String, )


  def main(args: Array[String])  = {
    println(formatAbs(-22101844))
    println(formatfactorial(7))
  }


}
