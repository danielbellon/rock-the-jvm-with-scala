package lectures.part1basics

object CalledByValueVsCalledByName extends App {

  def callByValue(x: Long): Unit = {
    println("By value: " + x)
    println("By value: " + x)
    println("By value: " + x)
  }

  def callByName(x: => Long): Unit = {
    println("By name: " + x)
    println("By name: " + x)
    println("By name: " + x)
  }

  callByValue(System.nanoTime())
  println("===================")
  callByName(System.nanoTime())
}
