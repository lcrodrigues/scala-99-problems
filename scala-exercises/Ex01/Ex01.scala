object Ex01 {
    def main(args: Array[String]) = {
        val list = List(1, 2, 3, 4, 5)
        println(last(list))
    }

    def last(list: List[Any]): Any = {
        if (list.isEmpty) {
             throw new NoSuchElementException("Empty list.")
        } else {
            return list.last
        }
    }
}