package lectures.part2oop

import java.time.Year

object OOBasics extends App {

	val person = new Person("Jhon", 26)
	val anotherPerson = new Person("Someone")

	println(person.age)
	println(person.age)

	person.greet("Daniel")

}

// Constructor
class Person(name: String, val age: Int) {

	def this(name: String) = this(name, 0)

	def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

}

// Class parameters are NOT fields

class Writer(val firstName: String, val surname: String, val year: Int) {

	def fullName: String = s"$firstName $surname"

}

class Novel(val name: String, val releaseYear: Int, val author: Writer) {

	def authorAge: Int = Year.now.getValue - author.year

	def isWrittenBy(author: Writer): Boolean = this.author == author

	def copy(newReleaseYear: Int): Novel = new Novel(name, newReleaseYear, author)

}

class Counter(val count: Int = 0) {

	def increment = new Counter(count + 1)

	def increment(amount: Int) = new Counter(count + amount)

	def decrement = new Counter(count - 1)

	def decrement(amount: Int) = new Counter(count - amount)

}