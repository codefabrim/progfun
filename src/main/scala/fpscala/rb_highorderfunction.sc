import scala.annotation.tailrec




def factorial (n: Long): Long  = {
 @tailrec
  def go(n: Long, acc: Long): Long = {
   if(n <= 0) acc
   else go(n-1, acc * n)
 }
  go(n,1)
}

  factorial(30)
  factorial(1)



def abs(x: Int) : Int ={
  if(x >= 0) x
  else -x
}

abs(-5)
abs(15)



