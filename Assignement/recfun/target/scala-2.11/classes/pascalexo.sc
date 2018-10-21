

{

  def factoriel (n : Int) : Int  =
    if (n == 0) 1 else n* factoriel(n-1)


  factoriel(3)
  factoriel(4)

}



{
   //def main(args: Array[String]) {
   def main()={
      println("Pascal's Triangle")
      for (row <- 0 to 10) {
        for (col <- 0 to row)
          print(pascal(col, row) + " ")
        println()
      }

      def pascal(c: Int, r: Int): Int = {


        if (c == 0 || r == c ) 1
        else  pascal(r-1, c) + pascal(r-1, c+1)


      }


    }


main()



  }


