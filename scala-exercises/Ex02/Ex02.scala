object Ex02 {
  def main(args: Array[String]) = {
    val list = List(1)
    println(penultimate(list))
  }

  def penultimate(list: List[Any]): Any = {
    if (list.isEmpty) {
        throw new NoSuchElementException("Empty list.")
    } else if (list.size == 1) {
        throw new NoSuchElementException("Only 1 element.")
    } else {
        return list.init.last
    }
  } 
}
