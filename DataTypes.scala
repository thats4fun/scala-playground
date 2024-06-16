
object BasicSyntax {
  def main(args: Array[String]): Unit = {

    // define variables using val/var keywords
    val name: String = "Scala"
    var age: Int = 10
    val pi: Double = 3.14
    var isScalaFun: Boolean = true

    // Print values
    println(s"name = ${name}")
    println(s"age = ${age}")
    println(s"pi = ${pi}")
    println(s"isScalaFun = ${isScalaFun}")
  }

  // usage of `conditionals`
  def checkNumber(x: Int): Unit = {
    val x = 10
    if (x > 0) {
      println("Positive")
    } else if (x < 0) {
      println("Negative")
    } else {
      println("Zero")
    }
  }

  // usage of `while` loop
  def useWhile(x: Int): Unit = {
    var i = 0
    while (i < x) {
      println(i)
      i += 1
    }
  }

  // usage of `for` loop
  def useFor(x: Int): Unit = {
    for (i <- 1 to x) {
      println(i)
    }
  }

  // usage of `for comprehensions`
  def useForComprehensions(): Unit = {
    val nums = List(1, 2, 3, 4, 5)
    val squares = for (n <- nums) yield n * n
    println(squares)
  }
}