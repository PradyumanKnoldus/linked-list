import org.scalatest.flatspec.AnyFlatSpec

class LinkedListTest extends AnyFlatSpec {

  "A LinkedList" should "insert elements at the beginning" in {
    val list = new LinkedList[Int]()
    list.insert(1)
    list.insert(2)
    list.insert(3)
    assert(list.search(1) === true)
    assert(list.search(2) === true)
    assert(list.search(3) === true)
    assert(list.search(4) === false)
  }

  it should "delete elements from the list" in {
    val list = new LinkedList[Int]()
    list.insert(1)
    list.insert(2)
    list.insert(3)
    list.delete(2)
    assert(list.search(2) === false)
    list.delete(1)
    assert(list.search(1) === false)
    list.delete(3)
    assert(list.search(3) === false)
  }

  it should "traverse the list and print all elements" in {
    val list = new LinkedList[String]()
    list.insert("hello")
    list.insert("Scala")
    list.insert("World")
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      list.traverse()
    }
    assert(stream.toString === "World\nScala\nhello\n")
  }
}
