import scala.collection.mutable.ListBuffer

object Ex05 {
    def main(args: Array[String]) = {
        val list = List(1, 2, 3, 4, 5)
        println(reverse(list))
    }

    def reverse(list: List[Any]): Any = {
        if (list.isEmpty) {
            throw new NoSuchElementException("Empty list.")
        } else {
            // return list.reverse

            val listSize = list.size - 1
            val reversedList = new ListBuffer[Any]()
            for (i <- 0 to listSize) {
                reversedList += list(listSize - i)
            }

            return reversedList.toList
        }
    }
}
