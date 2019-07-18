package lectures.part1basics

object StringOperations extends App {

  val numericString = "2"
  val number = numericString.toInt

  println('a' +: numericString)
  println('a' +: numericString :+ 'z')
  println(numericString :+ 'z')

  // S-Interpolator (Replacing string)
  val name = "Daniel"
  val age = 28
  val greeting = s"Hello my name is $name and I am $age years old"
  val anotherGreeting = s"Hello my name is $name and I will be turning ${age +1} years old"

  println(greeting)
  println(anotherGreeting)

  // F-interpolator (Formatting a string)
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"

  println(myth)

  // raw-interpolator
  println("This is a \n newline")
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
