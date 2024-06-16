// Type Parameter
def identity[T](x: T): T = x

// Type Bounds
def compare[T <: Comparable[T]](x: T, y: T): Int = x.compareTo(y)

implicit val defaultName: String = "Default User"

def welcomeUser(implicit name: String): String = s"Welcome, $name!"

def concatenate[T](a: T, b: T)(implicit ev: T => String): String = a + b

def main(args: Array[String]): Unit = {
  println(identity(42)) // Output: 42
  println(identity("Hello")) // Output: Hello

  println(compare("apple", "banana"))

  println(welcomeUser) // Output: -1

  println(concatenate(1, 2)) // Output: 12
  println(concatenate("Scala", "Rocks")) // Output: ScalaRocks
}
