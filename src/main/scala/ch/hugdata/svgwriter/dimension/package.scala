package ch.hugdata.svgwriter

import ch.hugdata.svgwriter.dimension.LengthUnit.LengthUnit

package object dimension {

  implicit final class LengthInt(private val n: Int) extends AnyVal with LengthConversion {
    override protected def lengthIn(unit: LengthUnit): Length = Length(n.toDouble, unit)
  }

  implicit final class LengthLong(private val n: Long) extends AnyVal with LengthConversion {
    override protected def lengthIn(unit: LengthUnit): Length = Length(n.toDouble, unit)
  }

  implicit final class LengthDouble(private val n: Double) extends AnyVal with LengthConversion {
    override protected def lengthIn(unit: LengthUnit): Length = Length(n, unit)
  }

}
