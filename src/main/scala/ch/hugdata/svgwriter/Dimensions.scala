package ch.hugdata.svgwriter

import ch.hugdata.svgwriter.geometry.Location2D

/**
  * Defines the dimensions of an svg.
  */
case class Dimensions(minX: Double,
                      maxX: Double,
                      minY: Double,
                      maxY: Double) {

  def withinLimits(point: Location2D): Boolean = withinLimits(point.x, point.y)

  def withinLimits(xPos: Double, yPos: Double): Boolean = {
    xPos >= minX &&
      xPos <= maxX &&
      yPos >= minY &&
      yPos <= maxY
  }

  def withinLimits(dimensions: Dimensions): Boolean = {
    dimensions.minX >= minX &&
      dimensions.maxX <= maxX &&
      dimensions.minY >= minY &&
      dimensions.maxY <= maxY
  }
}