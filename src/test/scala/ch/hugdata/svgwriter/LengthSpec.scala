package ch.hugdata.svgwriter

import ch.hugdata.svgwriter.dimension._
import org.scalatest.FlatSpec

import scala.language.postfixOps

class LengthSpec extends FlatSpec {

  "A length" should "be created" in {
    val length0: Length = 12 px;
    assert(length0.value === 12.0)
    assert(length0.unit == LengthUnit.PX)

    val length1: Length = 42 pixel;
    assert(length1.value === 42.0)
    assert(length1.unit == LengthUnit.PX)

    val length2: Length = 33.3 pixel;
    assert(length2.value === 33.3)
  }

  it should "be able to use em as unit" in {
    val length: Length = 12 em;
    assert(length.value === 12.0)
    assert(length.unit == LengthUnit.EM)
  }

  it should "be able to use ex as unit" in {
    val length: Length = 12 ex;
    assert(length.value === 12.0)
    assert(length.unit == LengthUnit.EX)
  }

}
