package datastructures

//sealed  : all implementtion of trait must be in this file
//+A : covariant or positivparameter of list
// List[Dog] is a subtyp of List[Aniumal] when Dog is a subtyp of Anial


sealed trait List [+A]
case object Nil extends List[Nothing]  //Nothing is a subtyp of all types
case class Cons [+A] (head: A, tail: List[A]) extends List[A]


object List {   //companion object  always with same name of data type with convenience functions
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

def product(ds: List[Double]): Double = ds match {
  case Nil => 1
  case Cons(0.0, _) => 0.0
  case Cons(x,xs) => x * product(xs)
}

  def myTailo[A] (l: List[A]):  List[A] =
    l match {

      case Nil => sys.error("tail of empty list")
      case Cons(_, t) => t

    }

  //variadic function apply in scala d.h accept Zero or more argument of type A
  def apply [A](as: A*) : List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))



  def main(args: Array[String]):Unit = {
    val x =  List (1, 2,3,4,5,6,7)
    println(myTailo(x))





  }
}

