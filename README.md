# Programmation fonctionnelle - TD5
Le but de ce TD est d'implémenter la méthode de tri a bulle

## Installation
* Télécharger le [**ZIP**](https://github.com/poussard/scala-TD5/archive/master.zip) et décompresser le
* Ou taper la commande git clone https://github.com/poussard/scala-TD5.git
* Importer le comme 'Existing Projects into Workspace'

## Liste des fichiers

    src
    |- main
    |  |- scala
    |  |  |- common
    |  |  |  |- package.scala
    |  |  |- tri
    |  |  |  |- Bulle.scala     // Méthodes a implémenter
    |  |  |  |- Fusion.scala    // Méthodes a implémenter
    |- test
    |  |- scala
    |  |  |- tri
    |  |  |  |- BulleSuite.scala  // Tests tri bulles
    |  |  |  |- Fusion.scala      // Tests fusion liste

## Tri Bulle
Le tri a bulles ou tri par propagation est un algorithme de tri qui consiste a faire remonter progressivement les plus grands elements d'un tableau, comme les bulles d'air remontent à la surface d'un liquide.

L'algorithme du tri est découpé en deux fonctions.

une fonction compare deux a deux les elements e1 et e2 consecutifs d'une liste et d'effecteur une permutation si e1 > e2
* ( 5 1 4 2 8 ) ->  ( 1 5 4 2 8 )  Les elements 5 et 1 sont compares, et comme 5 > 1, l'algorithme les intervertit.
* ( 1 5 4 2 8 ) ->  ( 1 4 5 2 8 )  Interversion car 5 > 4.
* ( 1 4 5 2 8 ) ->  ( 1 4 2 5 8 )  Interversion car 5 > 2.
* ( 1 4 2 5 8 ) ->  ( 1 4 2 5 8 )  Comme 5 < 8, les elements ne sont pas echanges. 
Signature  
```scala
def bubble[A](myList: List[A], fonctionOrdre: (A,A) => Boolean):List[A]
```

une fonction qui continue de trier (fonction bulle) jusqu'a ce qu'il n'y ait plus de permutation ( la liste de initial est la meme de la final)
Signature 
```scala
def bubbleTri[A](myList: List[A], fonctionOrdre: (A,A) => Boolean):List[A]
```
## Fusion
Ecrire une methode qui fusionne 2 listes triees

Signature 
```scala    
     def fusion(list1: List[Int],list2: List[Int]): List[Int]
```    
Avec Type generique
```scala 
    def fusionPoly[A](list1: List[A],list2: List[A],fonctionOrdre: (A,A) => Boolean): List[A]
```

