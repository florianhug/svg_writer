package ch.hugdata.svgwriter

/**
  * Type for a [[SvgElement]]s properties
  */
case class Property(key: String, value: String) {
  def toSvg =s"""$key="$value""""
}

object Property {
  def stroke(color: String) = Property("stroke", color)

  def strokeWidth(width: Int) = Property("stroke-width", width.toString)

  def fill(color: String) = Property("fill", color)

  def size(size: Int) = Property("r", size.toString)
}