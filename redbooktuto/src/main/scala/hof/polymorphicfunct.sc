
/**
def findfirstStr(ss: Array[String], key: String) : Int ={
  @annotation.tailrec
  def go(ss:Array[String], counter: Int): Int = {
    if (ss.isEmpty) -1
    else if (ss.head == key) counter
      else go(ss.tail, counter + 1)
  }

  go(ss, 0)
}

findfirstStr(Array("s", "a", "l", "u", "t"), "w" )
findfirstStr(Array("s", "a", "l", "u", "t"), "u" )
findfirstStr(Array("s", "a", "l", "u", "t"), "s" )
findfirstStr(Array("s", "a", "l", "t", "u", "t"), "t" )


def findfirst[A](ss: Array[A], key: A) : Int ={
  @annotation.tailrec
  def go(ss:Array[A], counter: Int): Int = {
    if (ss.isEmpty) -1
    else if (ss.head == key) counter
    else go(ss.tail, counter + 1)
  }

  go(ss, 0)
}

findfirst(Array("s", "a", "l", "u", "t"), "w" )
findfirst(Array("s", "a", "l", "u", "t"), "u" )
findfirst(Array("s", "a", "l", "u", "t"), "s" )
findfirst(Array("s", "a", "l", "u", "t"), "w" )
findfirst(Array("s", "a", "l", "t", "u", "t"), "t" )
findfirst(Array(1,2 ,3, 4, 5, 6, 4,7,2, 8), 2 )
findfirst(Array(1,2 ,3, 4, 5, 6, 4,7,2, 8), 4 )


def findfirstp[A](ss: Array[A], p: A => Boolean) : Int ={
  @annotation.tailrec
  def loop(n: Int): Int = {
    if (n >= ss.length) -1

    else if (p(ss(n))) n
    else loop(n + 1)
  }

  loop(0)
}

findfirstp(Array("s", "a", "l", "u", "t"),  x == "s" )
findfirstp(Array("s", "a", "l", "u", "t"),)

*/



/**
def isSorted[A](ss: Array[A], ordered: (A,A) => Boolean) : Boolean ={
  @annotation.tailrec
  def go(ss:Array[A], counter: Int): Int = {
    if (ss.isEmpty) -1
    else if (ss.head == key) counter
    else go(ss.tail, counter + 1)
  }

  go(ss, 0)
}
*/


def findfirstStr(ss: Array[String], key: String) : Int ={
  @annotation.tailrec
  def loop(i: Int): Int = {
    if (i >= ss.length) -1
    else if (ss(i) == key) i
    else loop(i+1)
  }

  loop(0)
}

findfirstStr(Array("s", "a", "l", "u", "t"), "w" )
findfirstStr(Array("s", "a", "l", "u", "t"), "u" )
findfirstStr(Array("s", "a", "l", "u", "t"), "s" )
findfirstStr(Array("s", "a", "l", "t", "u", "t"), "l" )



def findfirst[A](as: Array[A], p: A => Boolean) : Int ={
  @annotation.tailrec
  def loop(i: Int): Int = {
    if (i >= as.length) -1
    else if (p(as(i))) i
    else loop(i+1)
  }

  loop(0)
}


def isLetterTFound[A](c: A): Boolean = {
  if (c == "t")   true
  else false
}

findfirst(Array("s", "a", "l", "u", "t"), isLetterTFound)
findfirst(Array("s", "a", "l", "u", "tt"), isLetterTFound)


/**check if an array is Sorted   */

def isSorted[A] (as: Array[A], h: (A,A) => Boolean): Boolean ={

  @annotation.tailrec
  def loop(n: Int) : Boolean ={
    if (n  >= as.length-1) true
    else if(h(as(n), as(n+1)))  loop(n+1)
    else false
  }

  loop(0)
}

def gt[A](first:A, second: A) : Boolean = {
  if (first.toString < second.toString) true
  else false
}

/**
val lessThan = new Function2(Int, Int, Boolean) {
  def apply(a: Int, b: Int) = a < b
}
  */


isSorted(Array("s", "a", "l", "u", "t"), gt)
isSorted(Array("s",  "t", "w", "x"), gt)
isSorted(Array("s",  "t", "w", "x", "b"), gt)
isSorted(Array(1, 3,5, 6, 7), gt)
isSorted(Array(1, 3,5, 6, 7, 3), gt)

/** HOF with anonymous functions */

findfirst(Array("s", "a", "l", "u", "tt"), (x: String) => x =="l")
findfirst(Array(1, 3, 5, 6, 7, 5,4, 3), (x: Int) => x ==5)



