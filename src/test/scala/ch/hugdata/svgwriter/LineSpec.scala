package ch.hugdata.svgwriter

import ch.hugdata.svgwriter.geometry.Location2D
import org.scalatest.FlatSpec

class LineSpec extends FlatSpec {

  "A line" should "serialize to an svg element" in {
    val startPoint = Location2D(50, 25)
    val endPoint = Location2D(150, 120)
    implicit val limits: Dimensions = Dimensions(0, 400, 0, 400)
    val properties = Seq(Property.strokeWidth(2))
    val svgLine = Line(startPoint, endPoint, properties).toSVG()
    assert(svgLine.isSuccess)
    assert(svgLine.getOrElse("") === """<line x1="50.0" y1="25.0" x2="150.0" y2="120.0" stroke-width="2" />""")
  }

  it should "not serialize a line where the starting point is outside the graphics limits" in {
    val startPoint = Location2D(-22, 25)
    val endPoint = Location2D(150, 120)
    implicit val limits: Dimensions = Dimensions(0, 400, 0, 400)
    val properties = Seq(Property.strokeWidth(2))
    val svgLine = Line(startPoint, endPoint, properties).toSVG()
    assert(svgLine.isFailure)
  }

  it should "not serialize a line where the end point is outside the graphics limits" in {
    val startPoint = Location2D(25, 25)
    val endPoint = Location2D(150, 9001)
    implicit val limits: Dimensions = Dimensions(0, 400, 0, 400)
    val properties = Seq(Property.strokeWidth(2))
    val svgLine = Line(startPoint, endPoint, properties).toSVG()
    assert(svgLine.isFailure)
  }
}
