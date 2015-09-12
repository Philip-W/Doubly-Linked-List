
public class doubleLinkList{

  private Node head; //first element
  private Node tail; //second element
  private int size;

  public doubleLinkList(){
    //testing an empty initialization, where the first node == null
    Node h = new Node(null);
    head = h;
    tail = h;
}

  public Node getHead(){
    //returns head, only really used for iterating through the
    //list since the head node is null.
    return head;
  }

  public Node getTail() { return tail; }// returns the last element in the list.

  public int getSize() { return size; }// returns the number of Nodes in the list
                                       // limits the size!
  public void addToTail(Object o){
    Node n = new Node(o);
    tail.setNext(n);
    n.setPrev(tail);
    n.setNext(null);
    tail = n;

  }


  public void addNode(Object o, int index){
    //Inserts a Node after the given index (might bug due to null head)
    //if the index is > size, it will be appended to teh end of the list.

    Node n = new Node(o);
    Node before = head;
    Node after;

    if (index < 0){
      throw new IndexOutOfBoundsException("Index "+ index + " is negative!");
    }

    if (size == 0){
      addToTail(o);
      return;
    }

    for (int i = 1; i <index && before.Next() != null; ++i){
      before = before.Next();
    }
    after = before.Next();

    n.setPrev(before);
    n.setNext(after);
    before.setNext(n);
    after.setPrev(n);
    size++;
  }

  public void removeNode(int index){} //Removees a node at an index

  public String toString(){
    Node n = head.Next();
    String out = "";
    while (n != null){
      out = out + n.getData().toString() + " ";
      n = n.Next();
    }
    return out;
  }

}
