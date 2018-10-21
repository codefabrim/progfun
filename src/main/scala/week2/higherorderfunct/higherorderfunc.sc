  /** Sommation entre a et B  */
  def sumInts (a: Int, b: Int):Int = {
    if (a > b) 0
    else a + sumInts(a + 1, b)

  }

  sumInts(1,3)


  /** Take the sum of the cubes of all Integer between a an d b  */

def cube (x: Int) : Int = x * x * x

cube (3)
cube (4)






  def sumCube(a: Int, b: Int): Int ={
    if (a > b ) 0
    else cube(a) + sumCube(a+1, b)


  }

sumCube(1, 3)
sumCube(1, 4)

  /** Take the sum of the FACTORIEL of all Integer between a an d b  */

  def fact2(a: Int): Int = {
    if (a == 0) 1
    else a * fact2(a - 1)
  }



  def sumFactorials(a: Int, b: Int): Int = {
    if (a > b) 0
    else fact2(a) + sumFactorials(a + 1, b)
  }




  "fact2(3) = " + fact2(3)


  "sumFactorials(1, 3) =   " +
  sumFactorials(1, 3)




  /** Factorise the functions Sum in higher Order function which ta
    * ke as parameter another function
    *
    *
    * with definition of the type of  function '=>'
    * */




  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a >b) 0
    else f(a) + sum (f, a + 1, b)

    }


  def id(x: Int ) : Int = x


  sum (id, 1, 3)
  def sumId2(a: Int, b: Int): Int = sum(id, a, b)
  sumId2(1,3)

 def factorials2(a: Int, b: Int):Int = sum (fact2, a, b)

  factorials2(1,3)


  def sumCube2(a: Int, b: Int) : Int = sum(cube, a, b)
  sumCube2 (1,3)
  sumCube2 (1,4)
  sumCube2 (1,5)
  sumCube2 (1,6)





  /** Anonymous functiuiomn   with Sum  */


  def sumInts2 (a: Int, b: Int) =  sum (x => x, a ,b)
  def sumCubes2 (a: Int, b: Int) =  sum (x => x * x * x , a ,b)

  sumInts2(1, 3)

  sumCubes2(1,4)



