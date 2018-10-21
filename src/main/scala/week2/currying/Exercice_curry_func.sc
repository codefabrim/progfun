

def mapReduce(f: Int => Int, combine: (Int, Int) => Int,  zero: Int)(a: Int, b: Int): Int = {
  if (a > b)  zero
  else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
}



/**  original version
 def product(f: Int => Int)(a: Int, b: Int): Int =
     if (a > b) 1
      else f(a) * product(f)(a + 1, b)
   * */

  def product(f: Int => Int)(a: Int, b: Int): Int =  mapReduce(f, (x,y) => x * y,1)(a,b)




  /** Produit de Int */
    product(x => x )(1, 2)


  /** Produit des carre */
    product(x => x * x)(3, 7)
    product(x => x * x)(1, 2)

  /** Produit des cubes */
    product(x => x*x*x )(1, 2)
    product(x => x*x*x )(1, 2)



def fact (n: Int): Int = product(x => x)(1, n)

  fact(5)





