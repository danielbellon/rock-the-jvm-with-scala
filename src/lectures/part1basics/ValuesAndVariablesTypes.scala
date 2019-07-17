package lectures.part1basics

object ValuesAndVariablesTypes extends App {

  // -------------------------------------------------------------------------------------------------------------------
  // Values
  // -------------------------------------------------------------------------------------------------------------------

  // Values are immutable
  val x = 42
  println(x)
  // x = 4

  val stringValue: String = "something"
  val anotherStringValue = "another thing"

  val booleanValue: Boolean = false
  val charValue: Char = 'A'
  val intValue: Int = 23423
  val longValue: Long = 342348053453405930L

  // -------------------------------------------------------------------------------------------------------------------
  // Variables are NOT immutable
  // -------------------------------------------------------------------------------------------------------------------

  var intVariable = 43645
  intVariable += 4564565
  print(intVariable)

}
