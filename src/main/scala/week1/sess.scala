package week1

object sess   extends App {

  1+4

  def abs(x: Double) = if (x < 0) -x else x


  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)


  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001


  def improve(guess: Double, x: Double) =
    (x / guess + guess) / 2


  def sqrt(x: Double) = sqrtIter(1.0, x)


  sqrt(5)


}
