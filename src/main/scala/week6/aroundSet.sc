val fruits = Set("bananan", "apple", "pear")

val s = (1 to 6).toSet
val s10 = (1 to 10).toSet

s map (_ +2)
s.nonEmpty

fruits filter (_ startsWith("app"))

def isSafe(col: Int, queens: List[Int]) : Boolean = {
  //queens contains col
  val row = queens.length
  val queensWithRow = (row -1 to 0  by -1) zip queens

  queensWithRow forall{
    case (r, c) => col != c  &&  math.abs(col - c)  != row - r

  }


}



def queens(n: Int) : Set[List[Int]] = {
  def placeQueens(k: Int) : Set[List[Int]] =

    if (k == 0) Set(List())
    else
    for {
      queens <- placeQueens(k -1)
      col <- 0 until n
      if isSafe(col, queens)

    } yield col :: queens


  placeQueens(n)




}

def show (queens: List[Int]) = {

  val lines =
    for (col <- queens.reverse)
      yield Vector.fill(queens.length) ("* ").updated(col, "X ").mkString
  "\n" + (lines mkString "\n")
}


queens(4)
queens(4)  map show
(queens(4)  map show) mkString "\n"
//(queens(12)  map show) mkString "\n"


