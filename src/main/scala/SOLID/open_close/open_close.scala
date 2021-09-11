package SOLID.open_close

import scala.annotation.tailrec

object openclose {


  def main(args: Array[String]): Unit = {

    val r: Rectangle = new Rectangle()

    r.length = 5
    r.breadth = 10

    val r2: Rectangle = new Rectangle()

    r2.length = 2
    r2.breadth = 4


    val r_arr: Array[Rectangle] = Array.ofDim[Rectangle](2)
    r_arr(0) = r
    r_arr(1) = r2


    val calArea = (rectangle: Rectangle) => {
      rectangle.length * rectangle.breadth
    }
    val totalArea = (rect: Array[Rectangle]) => {
      @tailrec
      def areaCal(area: Double, index: Int): Double = {

        if (index == rect.length)
          return area
        else
          return areaCal(area + calArea(rect(index)), index + 1)

      }

      areaCal(0, 0)
    }

    println("The total area is " + totalArea(r_arr))
  }


}
