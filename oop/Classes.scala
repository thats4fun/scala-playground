package oop

// Regular class
class Person(val name: String, var age: Int) {
  def greet(): String = s"Hello my name is $name and I'm $age years old."
}

class Animal(val name: String, val species: String) {
  def describe(): String = s"This is a $species named $name"
}

// Case class - immutable and has built-in methods
case class Point(x: Int, y: Int)

def main(args: Array[String]): Unit = {
  // Object creation
  val person = new Person("Alice", 25)
  println(person.greet())

  val pointA = Point(1, 2)
  val pointB = Point(1, 2)

  println(pointA == pointB)

  //
  val dog = new Animal("Buddy", "Dog")
  println(dog.describe())

  case class Car(make: String, model: String)
  val toyota = Car("Toyota", "Corolla")
  val secondToyota = Car("Toyota", "Corolla")

  println(toyota == secondToyota)
}