
{

  def factoriel (n : Int) : Int  =
    if (n == 0) 1 else n* factoriel(n-1)


  factoriel(3)
  factoriel(2)

}



{


  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a%b)


  gcd(14, 21)


}



{

  def abs(x: Double): Double = if (x < 0) -x else x

  def sqrt(x: Double) = {



    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))


    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001


    def improve(guess: Double) =
      (x / guess + guess) / 2


    sqrtIter(1)

  }

  println(sqrt(0.001))
  println(sqrt(0.1e-20))
  println(sqrt(1.0e-20))
  println(sqrt(1.0e-50))
  println(sqrt(1.0e50))


}




