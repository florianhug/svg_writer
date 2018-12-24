package ch.hugdata.svgwriter

import ch.hugdata.svgwriter.dimension.Length
import ch.hugdata.svgwriter.dimension._

import scala.language.postfixOps
import scala.util.{Failure, Success, Try}

/**
  * Type for the circle svg element.
  * [[https://developer.mozilla.org/en-US/docs/Web/SVG/Element/circle See: MDN]]
  */
case class Circle(private val cx: Length, private val cy: Length, private val r: Length)
  extends SvgElement {

  def this(cx: Int, cy: Int, r: Int) = this(cx px, cy px, r px)

  def this(cx: Long, cy: Long, r: Long) = this(cx px, cy px, r px)

  def this(cx: Float, cy: Float, r: Float) = this(cx px, cy px, r px)

  def this(cx: Double, cy: Double, r: Double) = this(cx px, cy px, r px)

  private def renderSvg() = {
    s"""<circle cx="${cx.toSvg}" cy="${cy.toSvg}" r="${r.toSvg}" />"""
  }

  override def toSVG()(implicit limits: Dimensions): Try[String] = {
    if (limits.withinLimits(cx, cy)) {
      Success(renderSvg())
    } else {
      Failure(new Exception(s"The center $cx,$cy is outside of the drawing area."))
    }

  }
}
