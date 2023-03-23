object IntList extends App {

  val myList = new LinkedList[Int]

  myList.insert(5)
  myList.insert(10)
  myList.insert(15)
  myList.insert(20)

  myList.traverse() // prints: 20 15 10 5

  myList.delete(10)

  myList.traverse() // prints: 20 15 5

  println(myList.search(15)) // prints: true
  println(myList.search(10)) // prints: false

}
