
//package week3

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y


  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom

    )


   def neg  =
     new Rational(
       - numer,
       denom


   )


  def sub(that: Rational): Rational = add(that.neg)




  override def toString: String = numer + "/" + denom




}



//object rationals {
  val x = new Rational(1, 3)
  x.numer
  x.denom
//}


val y = new Rational(5,7)
x.add(y)
val z = new Rational(3,2)

x.neg
//y.neg


x.sub(y).sub(z)



