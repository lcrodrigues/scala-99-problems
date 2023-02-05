object Ex06 {
    def main(args: Array[String]) = {
        val list = List(1, 2, 3, 4, 3, 2, 1)
        println(isPalindrome(list))
    }

    def isPalindrome(list: List[Any]): Boolean = {
        if (list.isEmpty) throw new NoSuchElementException("Empty list.")

        var halfSize = list.size / 2
        val secondStart = if (isEven(list.size)) {
            halfSize
        } else {
            halfSize + 1
        }

        val firstHalf = list.slice(0, halfSize)
        val secondHalf = list.slice(secondStart, list.size)

        return firstHalf == secondHalf.reverse
    }  

    def isEven (number: Int): Boolean = {
        return number % 2 == 0
    }
}