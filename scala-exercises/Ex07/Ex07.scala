import scala.collection.mutable.ListBuffer

object Ex07 {
    def main(args: Array[String]) = {
        val list = List(List(1, 1), 2, List(3, List(5, 8)))
        println(flatten(list))
    }

    def flatten(list: List[Any]): List[Any] = list flatMap {
        case ls: List[Any] => flatten(ls)
        case item => List(item)
  }
}