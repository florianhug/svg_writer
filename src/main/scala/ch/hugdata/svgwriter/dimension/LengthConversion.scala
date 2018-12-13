package ch.hugdata.svgwriter.dimension

import ch.hugdata.svgwriter.dimension.LengthUnit._

trait LengthConversion extends Any {
  protected def lengthIn(unit: LengthUnit): Length

  def em = lengthIn(EM)

  def ex = lengthIn(EX)

  def px = lengthIn(PX)

  def pixel = px

  def pixels = px

  def in = lengthIn(IN)

  def inch = in

  def inches = in

  def cm = lengthIn(CM)

  def centimeter = cm

  def centimeters = cm

  def mm = lengthIn(MM)

  def millimeter = mm

  def millimeters = mm

  def pt = lengthIn(PT)

  def point = pt

  def points = pt

  def pc = lengthIn(PC)

  def pica = pc

  def picas = pc

  def percent = lengthIn(PERCENT)

  def % = percent
}
