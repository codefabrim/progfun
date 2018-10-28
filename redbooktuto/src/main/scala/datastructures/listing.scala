package datastructures

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object listing {

  def myTail[A] (l: List[A]):  List[A] = l match {

      case Nil => sys.error("tail of empty list")
      case Cons(_, t) => t
    }

//replace the forst element par  a given new value
  def setHead[A](l: List[A], a: A): List[A]  = l match {

    case Nil => sys.error("head of empty list")
    case Cons(_, t) =>  Cons(a ,t)
  }


  //generalize tail that remove the first n elemet from a list

def drop[A](l: List[A], n: Int) : List[A] = n match {
  case 0 =>  l
  case 1 => myTail(l)
  case _ => drop(myTail(l), n-1)

}

  //bessere version of drop ohne abhandigkeit
  def dropAlpha[A](l:List[A], n: Int): List[A] = {
    if (n <= 0) l
    else l match {
      case Nil => Nil
      case Cons(_, xs) => drop(xs, n-1)
    }
  }

  //implement dropWhile which remove element from the  List prefix  as long as they match a predicate

//3.5
  /**
    *DropWhile avec une liste de parametre : (l: List[A], f: A => Boolean)
    * cette version oblige a declare le typ parameter pour la anonym fuónction (x: Int) => x.<=4
    * @param l
    * @param f
    * @tparam A
    * @return
    */
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    //case false => l
    case Cons(h, t) if f(h) => dropWhile(t, f)
    case _  => l


  }

  /**
    * Version de dropWhile avec 2 list de paramentre  : (l: List[A]) (f: A => Boolean)
    * Permet d evitre a declarer le Type de paramentere de de  anonym function
    * @param l
    * @param f
    * @tparam A
    * @return
    */

  def dropWhileb[A](l: List[A]) (f: A => Boolean): List[A] = l match {
    //case false => l
    case Cons(h, t) if f(h) => dropWhile(t, f)
    case _  => l


  }






  def appends[A](a1: List[A], a2:List[A]):List[A] = a1 match {
      case Nil => a2
      case Cons(h,t) => Cons(h, appends(t, a2))

    }

//3.6
  //init: return a List excepted the last valid elemnt of the input List

  def init[A](a1: List[A]): List[A] = a1 match {
    case Nil => sys.error("init of an Empty list")
    case Cons(h, Nil) => Nil
    case Cons(h,t) => Cons(h,init(t))

  }



  /**
    * With lists, it’s common to use a temporary, mutable
    * buffer internal to the function (with lazy lists or streams, which we discuss in chapter 5, we don’t
    * normally do this). So long as the buffer is allocated internal to the function, the mutation is not
    * observable and RT is preserved
    *
    * @param l
    * @tparam A
    * @return
    */

  def init2[A](l: List[A]): List[A] = {
    val buf = new ListBuffer[A]

    @tailrec
    def loop(cur: List[A]):List[A] = cur match {
      case Nil => sys.error("init of a empoty list")
      case Cons(_, Nil) => List(buf.toList: _*)
      case Cons(h,t) => buf += h; loop(t)

    }

    loop(l)


  }


  /**
    * Recursionover list and  generalisation to hiher oder function
    * @param ints
    * @return
    */
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x,xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(x, xs) => x * product(xs)
  }

  def foldRight[A,B](as: List[A], z: B)(f: (A, B) => B): B =
    as match {
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  def sum2(ns: List[Int]) =
    foldRight(ns, 0)((x,y) => x + y)

  def product2(ns: List[Double]) =
    foldRight(ns, 1.0)(_ * _)



  def main(args: Array[String]):Unit = {
    val x =  List (1, 2,3,4,5,6,7)
    println(myTail(x))
    //println(myTail( List (1, 2,3,4,5,6,7)))
    //println(myTail(Nil))
    val s = List("fab","bri","ce")
    println(myTail(s))


    println(setHead(s,"Fab"))
    println("drop n element of a list ")
    println(drop(s, 2))
    println(drop(x, 0))
    println(drop(x, 1))
    println(drop(x, 2))
    println(drop(x, 3))

    println("dropAlpha: drop n element of a list ")

    println(dropAlpha(x, 0))
    println(dropAlpha(x, 1))
    println(dropAlpha(x, 2))
    println(dropAlpha(x, 3))

    println("dropWhile: remove element from the  List prefix  as long as they match a predicate ")

    println(dropWhile(x,  (x: Int) => x.<=( 3)))
    println(dropWhile(x,  (x: Int) => x.<=( 5)))
    println(dropWhile(x,  (x: Int) => x != 5))

    println("dropWhileB: no need to declare typ parameter for lambda" )
    println(dropWhileb(x) (x => x.<=( 3)) )
    println(dropWhileb(x) (x => x.<=( 5)) )
    println(dropWhileb(x) (x=> x != 5))







  println("append: add a list to another list")
    val  a1 =  List (1, 2,3,4,5,6,7)
    val  a2 =  List (8,9,10,11,12)

    println("a1: " + a1)
    println("a2: " + a2)
    println("a1 + a2:  "+appends(a1, a2))


    println("init: remove the precedent of Nil and retur the Listt")
    val  a3 =  List (1, 2,3,4,5,6,7)
    val  a4 =  List (8,9,10,11,12)

    println("a3: " + a3)

    println(" init a3:  "+init(a3))
    println(" init a3:  "+init2(a3))





  }

}
