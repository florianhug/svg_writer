package ch.hugdata.svgwriter

import org.scalatest.FlatSpec
import ch.hugdata.svgwriter.dimension._

import scala.language.postfixOps
import scala.util.Success


class CircleSpec extends FlatSpec {

  "A circle" should "be converted to SVG" in {
    val circle = Circle(50.0 px, 50.0 px, 10 px)
    implicit val limits: Dimensions = Dimensions(0, 400, 0, 400)

    val svgString = circle.toSVG()
    assert(svgString === Success("""<circle cx="50.0px" cy="50.0px" r="10.0px" />"""))
  }

}
