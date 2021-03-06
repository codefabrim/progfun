package week4

trait  List[+T] {

  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  //def prepend(elem: T): List[T] = new Cons(elem, this)
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
}



class Cons[T](val head: T, val tail: List[T]) extends List[T]{
  def isEmpty = false
}

class Nil[T] extends List[T]{
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}


object test {
  val x: List[String] = Nil
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x
  }

