package oop

trait Greeting {
  def greet(name: String): String = s"Hello, $name!"
}

class Person(val name: String) extends Greeting {
  def sayHello(): String = greet(name)
}

class Animal(val name: String, val species: String) {
  def describe(): String = s"This is a $species named $name"
}

trait Flyable {
  def fly(): String = "I can fly"
}

class Bird(name: String) extends Animal(name, "Bird") with Flyable

def main(args: Array[String]): Unit = {
  val person = new Person("Bob")
  println(person.sayHello()) // Output: Hello, Bob!
}