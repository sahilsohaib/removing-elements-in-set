object SetRemoval {
  def main(args: Array[String]): Unit = {
    var set = Set(1, 2, 3, 4, 5)

    println(s"Initial Set: $set")

    while (true) {
      println("Enter an element to remove (or 'q' to quit):")
      val input = scala.io.StdIn.readLine()

      if (input == "q") {
        println("Exiting program.")
        System.exit(0)
      }

      val elementToRemove = input.toInt
      if (set.contains(elementToRemove)) {
        set -= elementToRemove
        println(s"Updated Set: $set")
      } else {
        println(s"Element $elementToRemove not found in the set.")
      }
    }
  }
}
