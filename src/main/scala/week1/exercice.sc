import scala.annotation.tailrec


{
  def sum(xs: List[Int]): Int = {


    def loop(acc: Int, listt: List[Int]): Int = {
      if (listt.isEmpty) acc + 0
      else loop(acc + listt.head, listt.tail)


    }

    loop(0, xs)

  }

  sum(List(1, 2, 3))

}


{

  def factoriel(n: Int) : BigInt = {
    @tailrec
    def loop (acc: BigInt, n: Int):BigInt =
      if (n ==0) acc
      else  loop (acc * n, n-1)


    loop (1, n)


  }


  factoriel(4+36+43)

}