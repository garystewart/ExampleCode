package eu.ganda

import org.scalatest.FunSuite

/**
 * Created by m06f525 on 17/03/2015.
 */
class PatternTest extends FunSuite {

  test("Typed Pattern  Test") {
    case class Time (hours: Int) {}

    def whatTimeIsIt(any: Any): String = any match {
      case time: Time => s"It is ${time.hours} hours!"
      case _ => s"$any is no time!"
    }

    assert (whatTimeIsIt(Time(1)) == "It is 1 hours!")
    assert (whatTimeIsIt(1) == "1 is no time!")
  }






}
