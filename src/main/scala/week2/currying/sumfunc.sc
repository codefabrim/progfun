
{


 // sum(cube)(1, 10)

  //sumCubes(1, 10)
  //+ sumFactorials(10,20)

  def sumInts = sum(x => x)

  def sumCubes = sum(x => x * x * x)

  def sumFactorials = sum(fact)

  def fact(a: Int): Int = {
    if (a == 0) 1
    else a * fact(a - 1)
  }


  def cube(x: Int): Int = x * x * x


  def sum(f: Int => Int): (Int, Int) => Int = {

    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    }
    sumF

  }

  var a1 = sumCubes(1, 3)
  var a2 = sumCubes(1, 3) + sumFactorials(4,5)

  var a3 =  sum(cube)(1, 10)

  //sumCubes(1, 10)
  //+ sumFactorials(10,20)



}







