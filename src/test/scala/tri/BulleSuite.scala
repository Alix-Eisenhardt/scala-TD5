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
class TriSuite2 extends FunSuite {

  import Bulle._

  test("Tri Bull - Empty List ") {
    assert(bubbleTri(List(), (x: Int, y: Int) => x < y) === List())
  }

  test("Tri Bull - Int List ") {
    assert(bubbleTri(List(12, 21, 12345, 123, 21, 1234, 1), (x: Int, y: Int) => x < y) === List(1, 12, 21, 21, 123, 1234, 12345))
  }

  test("Tri Bull - Chars List ") {
    assert(bubbleTri(List('a', 'z', 'E', '1', 'r'), (x: Char, y: Char) => x < y) === List('1', 'E', 'a', 'r', 'z'))
  }

  test("Tri Bull - String List ") {
    assert(bubbleTri(List("12", "21", "12345", "123", "1234", "", "1"), (x: String, y: String) => x < y) === List("", "1", "12", "123", "1234", "12345", "21"))
  }

}
