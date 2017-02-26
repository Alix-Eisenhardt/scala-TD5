package tri

import common._

/**
 * Tri Bulle
 *
 * Le tri a bulles ou tri par propagation est un algorithme de tri qui consiste a faire remonter progressivement les plus
 * grands elements d'un tableau, comme les bulles d'air remontent a la surface d'un liquide.
 */

object Bulle {
  /**
   *  cette fonction compare deux a deux les elements e1 et e2 consecutifs d'une liste et d'effecteur une permutation si
   *  e1 > e2
   *
   *  ( 5 1 4 2 8 ) ->  ( 1 5 4 2 8 )  les elements 5 et 1 sont compares, et comme 5 > 1, l'algorithme les intervertit.
   *  ( 1 5 4 2 8 ) ->  ( 1 4 5 2 8 )  interversion car 5 > 4.
   *  ( 1 4 5 2 8 ) ->  ( 1 4 2 5 8 )  interversion car 5 > 2.
   *  ( 1 4 2 5 8 ) ->  ( 1 4 2 5 8 )  comme 5 < 8, les elements ne sont pas echanges.
   */
  def bubble[A](myList: List[A], fonctionOrdre: (A, A) => Boolean): List[A] = ???

  /**
   * Tri une liste
   * On continue de trier (fonction bulle) jusqu'a ce qu'il n'y ait plus de permutation ( la liste de initial est la meme
   * de la final)
   */
  def bubbleTri[A](myList: List[A], fonctionOrdre: (A, A) => Boolean): List[A] = ???
  
}