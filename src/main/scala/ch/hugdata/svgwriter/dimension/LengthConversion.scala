package ch.hugdata.svgwriter.dimension

import ch.hugdata.svgwriter.dimension.LengthUnit._

trait LengthConversion extends Any {
  protected def lengthIn(unit: LengthUnit): Length

  def em: Length = lengthIn(EM)

  def ex: Length = lengthIn(EX)

  def px: Length = lengthIn(PX)

  def pixel: Length = px

  def pixels: Length = px

  def in: Length = lengthIn(IN)

  def inch: Length = in

  def inches: Length = in

  def cm: Length = lengthIn(CM)

  def centimeter: Length = cm

  def centimeters: Length = cm

  def mm: Length = lengthIn(MM)

  def millimeter: Length = mm

  def millimeters: Length = mm

  def pt: Length = lengthIn(PT)

  def point: Length = pt

  def points: Length = pt

  def pc: Length = lengthIn(PC)

  def pica: Length = pc

  def picas: Length = pc

  def percent: Length = lengthIn(PERCENT)
}
