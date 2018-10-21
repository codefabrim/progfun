package week4


//peano numbers
abstract class Nat {


  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}



object Zero extends Nat {
  def isZero: Boolean = true
  def predecessor: Nat =
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat


}


class Succ(n: Nat) extends Nat{


}

