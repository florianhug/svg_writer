package ch.hugdata.svgwriter

import ch.hugdata.svgwriter.geometry.Location2D

import scala.util.{Failure, Success, Try}

/**
  * Type for SVG-Line
  *
  * @param start the start of the line
  * @param end   the end of the line
  */
case class Line(private val start: Location2D,
                private val end: Location2D,
                private val properties: Seq[Property] = Seq.empty) extends SvgElement {

  private def renderSvg() = {
    s"""<line x1="${start.x}" y1="${start.y}" x2="${end.x}" y2="${end.y}" ${properties.map(_.toSvg).mkString(" ")} />"""
  }


  override def toSVG()(implicit limits: Dimensions): Try[String] = {
    if (limits.withinLimits(start) && limits.withinLimits(end)) {
      Success(renderSvg())
    } else {
      Failure(new Exception("At least part of the polygon is out of limits."))
    }
  }
}
