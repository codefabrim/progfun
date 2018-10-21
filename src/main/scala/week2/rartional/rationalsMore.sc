
class Rational(x: Int, y: Int) {

  require (y != 0, "denoiminatoer must be nonzero")


  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  //def numer = x / g
  def numer = x
  //def denom = y / g
  def denom = y



  //def less(that: Rational) = numer * that.denom <  that.numer * denom
  def < (that: Rational) = numer * that.denom <  that.numer * denom

  def max(that:Rational) = if (this < that)  that else this

  def + (that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom

    )


   def unary_-  =
     new Rational(
       - numer,
       denom

   )


  def - (that: Rational): Rational = this + -that




  override def toString: String = {
     val g = gcd(numer, denom)
     numer/g + "/" + denom/g
  }





}



//object rationals {
  val x = new Rational(1, 3)
  x.numer
  x.denom
//}


val y = new Rational(5,7)
x + y
val z = new Rational(3,2)

//x

//y.neg


x - y -z

y + y



x < y

x.max(y)

//val strange = new Rational(1,0)

//strange.add(strange)


new Rational(2)

new Rational(1, 2).numer


y + y

x * x + y * y

