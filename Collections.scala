object Collections {
  def main(args: Array[String]): Unit = {
    // Common collections:

    // 1. List
    val nums = List(1, 2, 3, 4, 5)
    println(nums) // List(1, 2, 3, 4, 5)

    // 2. Set
    val set = Set(1, 2, 3, 4, 5)
    println(set) // HashSet(5, 1, 2, 3, 4)

    // 3. Map
    val map = Map("one" -> 1, "two" -> 2, "three" -> 3)
    println(map) // Map(one -> 1, two -> 2, three -> 3)


    // 4. Array
    val array = Array(1, 2, 3, 4, 5)
    println(array.mkString(", ")) // 1, 2, 3, 4, 5

    // Operations on Collections:
    println("Operations on Collections:")
    // map
    val squares = nums.map(x => x * x)
    println(squares) // Output: List(1, 4, 9, 16, 25)

    // filter
    val evenNums = nums.filter(x => x % 2 == 0)
    println(evenNums) // Output: List(2, 4)

    // reduce
    val sum = nums.reduce((x, y) => x + y)
    println(sum) // Output: 15

    // foreach
    nums.foreach(x => println(x))

    // fold
    val product = nums.fold(1)((x, y) => x * y)
    println(product) // Output: 120
  }
}