
object Functions {
  def main(args: Array[String]): Unit = {
    println(add(2, 3)) // Output: 5

    def square(x: Int): Int = x * x

    println(applyFunc(square, 5)) // Output 25

    def double(x: Int): Int = x * 2

    val nums = List(1, 2, 3, 4, 5)

    println(applyToList(double, nums)) // Output: List(2, 4, 6, 8, 10)
  }

  // example of returning a value from a function (no explicit return statement)
  def add(x: Int, y: Int): Int = {
    x + y
  }

  def applyFunc(f: Int => Int, x: Int): Int = {
    f(x)
  }

  def applyToList(f: Int => Int, list: List[Int]): List[Int] = {
    list.map(f)
  }

}