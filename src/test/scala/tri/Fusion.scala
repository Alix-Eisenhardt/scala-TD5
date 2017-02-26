package tri

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class implements a ScalaTest test suite for the methods in object `Insertion` that need to be implemented as part of
 * this assignment. A test suite is simply a collection of individual tests for some specific component of a program.
 *
 * A test suite is created by defining a class which extends the type `org.scalatest.FunSuite`. When running ScalaTest, it
 * will automatically find this class and execute all of its tests.
 *
 * Adding the `@RunWith` annotation enables the test suite to be executed inside eclipse using the built-in JUnit test runner.
 *
 * You have two options for running this test suite:
 *
 * - Right-click this file in eclipse and chose "Run As" - "JUnit Test"
 */

@RunWith(classOf[JUnitRunner])
class FusionSuite extends FunSuite {

  import Fusion._

  /**
   * Tests Fusion
   */

  test("Fusion - HappyPath I") {
    assert(fusion(List(1, 6, 10, 34), List(3, 7, 55)) === List(1, 3, 6, 7, 10, 34, 55))
  }

  test("Fusion - HappyPath II") {
    assert(fusion(List(1, 6, 10, 34), List(3, 7, 30, 31, 32, 33, 55)) === List(1, 3, 6, 7, 10, 30, 31, 32, 33, 34, 55))
  }

  test("Fusion - HappyPath III") {
    assert(fusion(List(1, 2, 3, 4), List(5, 6, 7, 8)) === List(1, 2, 3, 4, 5, 6, 7, 8))
  }

  test("Fusion - HappyPath IV") {
    assert(fusion(List(5, 6, 7, 8), List(1, 2, 3, 4)) === List(1, 2, 3, 4, 5, 6, 7, 8))
  }

  test("Fusion - Empty left List") {
    assert(fusion(List(), List(3, 7, 55)) === List(3, 7, 55))
  }

  test("Fusion - Empty right List") {
    assert(fusion(List(3, 7, 55), List()) === List(3, 7, 55))
  }

  test("Fusion - Empty lists") {
    assert(fusion(List(), List()) === List())
  }

  test("Fusion Gene - HappyPath I") {
    assert(fusionPoly(List(1, 6, 10, 34), List(3, 7, 55), (x: Int, y: Int) => x < y) === List(1, 3, 6, 7, 10, 34, 55))
  }

  test("Fusion Gene - HappyPath II") {
    assert(fusionPoly(List(1, 6, 10, 34), List(3, 7, 30, 31, 32, 33, 55), (x: Int, y: Int) => x < y) === List(1, 3, 6, 7, 10, 30, 31, 32, 33, 34, 55))
  }

  test("Fusion Gene - HappyPath III") {
    assert(fusionPoly(List('a', 'b', 'd'), List('c', 'e', 'f'), (x: Char, y: Char) => x < y) === List('a', 'b', 'c', 'd', 'e', 'f'))
  }

  test("Fusion Gene - HappyPath IV") {
    assert(fusionPoly(List(5, 6, 7, 8), List(1, 2, 3, 4), (x: Int, y: Int) => x < y) === List(1, 2, 3, 4, 5, 6, 7, 8))
  }

  test("Fusion Gene - Empty left List") {
    assert(fusionPoly(List(), List(3, 7, 55), (x: Int, y: Int) => x < y) === List(3, 7, 55))
  }

  test("Fusion Gene - Empty right List") {
    assert(fusionPoly(List(3, 7, 55), List(), (x: Int, y: Int) => x < y) === List(3, 7, 55))
  }

  test("Fusion Gene - Empty lists") {
    assert(fusionPoly(List(), List(), (x: Int, y: Int) => x < y) === List())
  }
}
