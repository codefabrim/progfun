
{

  /** dans le clacul d une facture la somme est calculer avec une reduction de 10% pour tout montant au dessus de 1000Euros
    * Il sera afficher aussi le montant de la reduction dans une ligne avec un label avantage client: montant de la reduction
    *
    * En fait c 'est 10% pour chaque article au dessus de 1000eur
    *
    * */


  //def Idx(x: Double): Double = { x => x }

  //def sumFractionel9Dixieme(x: Double, y: Int): Double =  { x * (1- y/10)}
  def neufDixiemeX(x: Double): Double = {
    x * (1 - 9 / 10)
  }


  def sum(f: Double => Double): (Double, Double) => Double = {
    def sumF(a: Double, b: Double): Double =
      if (a > b) 0
      else f(a) + sumF(a + 100, b)

    sumF
  }


  //def sumWithReduction10Percent = sum(x => x * (1 - 1 / 10))
  def sumWithReduction10Percent = sum(x => x * (0.9))


  sumWithReduction10Percent(1000, 1500)
  def sumWithReduction50Percent = sum(x => x * (0.5))
  sumWithReduction50Percent(1000, 1500)
  sum(x => x * (0.5))(1000, 1500)

}