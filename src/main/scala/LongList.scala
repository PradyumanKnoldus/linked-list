object LongList extends App {

  val myList = new LinkedList[Long]

  myList.insert(5L)
  myList.insert(10L)
  myList.insert(15L)
  myList.insert(20L)

  myList.traverse() // prints: 20 15 10 5

  myList.delete(10)

  myList.traverse() // prints: 20 15 5

  println(myList.search(15)) // prints: true
  println(myList.search(10)) // prints: false
}
