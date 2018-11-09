val capitalOfCountry = Map("US" ->"Washington",
  "France" -> "Paris",
  "Germany" -> "Berlin",
  "Netherland" -> "Den Haag")

capitalOfCountry("US")
capitalOfCountry("Belgium")

capitalOfCountry get "Belgium"
capitalOfCountry get "France"



def showCapital(country: String) : String =
  capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "missing data"
  }

showCapital("France")
showCapital("US")
showCapital("Belgium")



val fruits = List("apple", "banana","pear", "pineapple", "orange")

fruits.sortWith(_.length < _.length)
fruits.sorted


fruits.groupBy(_.head)
