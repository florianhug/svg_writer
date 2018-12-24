package ch.hugdata.svgwriter.dimension

/**
  * Acceptable units for lengths.
  * No unit should be converted to pixels, since it is the user unit
  *
  * This is defined such in the [[https://www.w3.org/TR/2011/REC-SVG11-20110816/single-page.html#coords-Units SVG1 spec]].
  * We are assuming that SVG2 still works the same way.
  */
object LengthUnit extends Enumeration {

  protected case class Val(value: String) extends super.Val {
    def toSvg: String = value
  }

  implicit def valueToLengthUnitVal(x: Value): Val = x.asInstanceOf[Val]

  type LengthUnit = Value
  val EM = Val("em")
  val EX = Val("ex")
  val PX = Val("px")
  val IN = Val("in")
  val CM = Val("cm")
  val MM = Val("mm")
  val PT = Val("pt")
  val PC = Val("pc")

}
