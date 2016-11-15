package ${package}

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class SimpleSpec extends FunSuite {
  test("add  numbers") {
    val x = 2
    val y = 2
    val z = x + y
    assert(z === 4)
  }
  test("multiply  numbers") {
    val x = 2
    val y = 2
    val z = x * y
    assert(z === 4)
  }
}
