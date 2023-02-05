object Ex03 {
    def main(args: Array[String]) = {
        val list = List(1, 2, 3, 4, 5)
        println(nth(1, list))
    }

    def nth(index: Int, list: List[Any]): Any = {
        if (list.isEmpty) {
            throw new NoSuchElementException("Empty list.")
        } else if (index < 0 || index >= list.size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index.")
        } else {
            return list(index)
        }
    }
}
