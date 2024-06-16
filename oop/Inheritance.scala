package oop

class Person(val name: String, var age: Int) {
  def greet(): String = s"Hello my name is $name and I'm $age years old."
}

class Employee(name: String, age: Int, val company: String) extends Person(name, age) {
  def work(): String = s"$name is working at $company"
}

def main(args: Array[String]): Unit = {
  val employee = new Employee("John", 25, "AA Ltd.")
  println(employee.work())
}