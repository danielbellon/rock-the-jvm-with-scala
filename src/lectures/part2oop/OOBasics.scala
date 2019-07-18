package lectures.part2oop

import java.time.Year

object OOBasics extends App {

	val person = new Person("Jhon", 26)
	val anotherPerson = new Person("Someone")

	println(person.age)
	println(person.age)

	person.greet("Daniel")

	// Testing counter ...
	val counter = new Counter()
	counter.increment.print()
	counter.increment(10).print()
	counter.decrement.print()
	counter.decrement(5).print()
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

	def increment: Counter = {
		println("Incrementing")
		new Counter(count + 1)
	}

	def increment(amount: Int): Counter = {
		if (amount <= 0) this
		else increment.increment(amount - 1)
	}

	def decrement: Counter = {
		println("Decrementing")
		new Counter(count - 1)
	}

	def decrement(amount: Int): Counter = {
		if (amount <= 0) this
		else decrement.decrement(amount - 1)
	}

	def print(): Unit = println(count)

}