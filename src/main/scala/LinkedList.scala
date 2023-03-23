class LinkedList[T] {

  private class Node(var data: T, var next: Node)

  private var head: Node = null

  // insert a new element at the beginning of the linked list
  def insert(data: T): Unit = {
    head = new Node(data, head)
  }

  // delete the first element in the linked list that matches the given data
  def delete(data: T): Unit = {
    head = deleteHelper(head, data)
  }

  // a recursive helper method to delete an element from the linked list
  private def deleteHelper(node: Node, data: T): Node = {
    if (node == null) {
      return null
    }
    if (node.data == data) {
      return node.next
    }
    node.next = deleteHelper(node.next, data)
    node
  }

  // search for an element in the linked list and return true if found, false otherwise
  def search(data: T): Boolean = {
    searchHelper(head, data)
  }

  // a recursive helper method to search for an element in the linked list
  private def searchHelper(node: Node, data: T): Boolean = {
    if (node == null) {
      return false
    }
    if (node.data == data) {
      return true
    }
    searchHelper(node.next, data)
  }

  // traverse the linked list and print all its elements
  def traverse(): Unit = {
    traverseHelper(head)
  }

  // a recursive helper method to traverse the linked list and print its elements
  private def traverseHelper(node: Node): Unit = {
    if (node == null) {
      return
    }
    println(node.data)
    traverseHelper(node.next)
  }
}
