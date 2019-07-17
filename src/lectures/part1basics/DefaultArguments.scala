package lectures.part1basics

import scala.annotation.tailrec

object DefaultArguments extends App {

  // -------------------------------------------------------------------------------------------------------------------
  // Factorial
  // -------------------------------------------------------------------------------------------------------------------

  @tailrec
  def factorial(n: Int, accumulator: Int = 1): Int = {
    if (n <= 1) accumulator
    else factorial(n - 1, n * accumulator)
  }

  println(factorial(5))

  // -------------------------------------------------------------------------------------------------------------------
  // Save picture
  // -------------------------------------------------------------------------------------------------------------------

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit =
    println("Saving picture. Format: " + format + " width: "+ width + " height: " + height)

  savePicture(width = 800)

}
