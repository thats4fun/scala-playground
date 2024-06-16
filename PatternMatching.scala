object PatternMatching {
  def main(args: Array[String]): Unit = {
    // Pattern Matching Syntax:
    val x = 2
    x match {
      case 1 => println("one")
      case 2 => println("two")
      case _ => println("other")
    }

    // Use cases:
    def describe(x: Any): String = x match {
      case 1 => "one"
      case "Hello" => "a greeting"
      case true => "truth"
      case _ => "something else"
    }

    println(describe(1))
    println(describe("Hello"))
    println(describe(true))
    println(5)

    println(categorizeNumber(-5)) // Output: negative
    println(categorizeNumber(0)) // Output: zero
    println(categorizeNumber(5)) // Output: positive
  }

  def categorizeNumber(x: Int): String = x match {
    case n if n < 0 => "negative"
    case 0 => "zero"
    case n if n > 0 => "positive"
  }
}