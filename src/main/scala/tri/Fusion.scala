package tri

import common._

object Fusion {

  /**
   * Fusion
   * Le but est de fusionner 2 listes triees
   * La liste final doit etre triee
   *
   * Rem: (head1::tail1,head2::tail2) est une representation d'un couple de liste
   *
   */
  def fusion(list1: List[Int], list2: List[Int]): List[Int] = ???

  /**
   * Avec Type generique
   */
  def fusionPoly[A](list1: List[A], list2: List[A], conditionOrdre: (A, A) => Boolean): List[A] = ???

}
