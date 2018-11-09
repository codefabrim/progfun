
//object pairs {
  val n = 7
(1 until n) map (i =>
    (1 until i) map (j => (i,j)))

// Vector(Vector(),
// Vector((2,1)),
// Vector((3,1), (3,2)),
// Vector((4,1), (4,2), (4,3)),
// Vector((5,1), (5,2), (5,3), (5,4)),
// Vector((6,1), (6,2), (6,3), (6,4), (6,5)))

//}



((1 until n) map (i =>
  (1 until i) map (j => (i,j)))).flatten


//with flatMap  == Map + flatten

(1 until n) flatMap (i =>
  (1 until i) map (j => (i,j)))



//now we filter the pair
def isPrime(n: Int) = (2 until n) forall (n % _ != 0)

(1 until n) flatMap (i =>
  (1 until i) map (j => (i,j))) filter  (pair =>
      isPrime(pair._1 + pair._2))



//for expresseion  in order to make more readable the use
// of HOF such as map, filter , flatMap

case class Person(name: String, age: Int)

//List[Person]
val persons = List(Person("tot", 2), Person("papa", 40), Person("mama", 35), Person("child1", 21))

for (p <- persons if p.age > 20) yield p.name



for {
  i <- 1 until n   //generator
  j <- 1 until i
  if isPrime(i + j)  //filter   here
} yield (i,j)     // always result as a List



def scalarProduct(xs: List[Double], ys: List[Double]): Double =
  (for ((x, y)  <- xs zip ys ) yield  x*y )
    .sum

val abs = List(1.3,3.2, 45.3)
val ord = List(76,4, 56.3, 23.1)

scalarProduct(abs,ord)



