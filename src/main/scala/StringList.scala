object StringList extends App {

  val linkedList = new LinkedList[String]()
  linkedList.insert("Hello")
  linkedList.insert("World")
  linkedList.insert("!")

  linkedList.traverse() // prints "!, World, Hello"

  linkedList.delete("World")

  linkedList.traverse() // prints "!, Hello"

  println(linkedList.search("Hello")) // prints "true"
  println(linkedList.search("World")) // prints "false"

}
