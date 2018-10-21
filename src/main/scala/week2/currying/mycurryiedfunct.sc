
{
  /** Faire la somme des integer avec cube ou carre */


  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =

      if (a > b) 0
      else f(a) + sumF(a + 1, b)

    sumF

  }


  //def sumCube(x: Int): Int = sum(x = x * x * x)
  def sumCube = sum(x => x * x * x)






var a =  "somme des cubiques "  +  sumCube(1, 4)
  println(a)



  def sumCarre = sum(x => x * x)


  var b =    "somme des carres "  +  sumCarre(1,4)
  println(b)

}


object Hello{
  def main (args: Array[String]) = println("Hello Sky")
}


println(Hello)

Hello.toString


