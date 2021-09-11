package SOLID.LSP

object AreaCalculation extends App {


  val rectangleArea = (length: Int, width: Int) => length * width
  println(rectangleArea(10, 20))

  val squareArea = (length: Int, width: Int) => length * width
  println(squareArea(10, 10))


}

