
def main(args: Array[String]): Unit = {
  println(greet("Alice"))
  val num: String = 42
  println(num)
}

def greet(name: String)(implicit greeting: String): String = s"$greeting, $name!"

implicit val defaultGreeting: String = "Hello"

// Implicit conversions
implicit def intToString(x: Int): String = x.toString