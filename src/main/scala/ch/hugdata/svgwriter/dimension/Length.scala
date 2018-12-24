package ch.hugdata.svgwriter.dimension

import ch.hugdata.svgwriter.dimension.LengthUnit.LengthUnit

case class Length(value: Double, unit: LengthUnit) {
  def toSvg: String =s"""$value${unit.toSvg}"""
}
