
public class doubleLinkList{

  private Node head; //first element
  private Node tail; //second element
  private int size;

  public doubleLinkList(){
    //testing an empty initialization, where the first node == null
    Node h = new Node(null);
    head = null;
    tail = null;
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



  }
  public void addNode(Object o, int index){
    //Inserts a Node after the given index (might bug due to null head)
    Node n = new Node(o);
    if (index < 0 || index > size - 1){ return; }
    Node before = head;
    Node after;
    for (int i = 1; i != index - 1; ++i){
      before = before.Next();
    }
    after = before.Next();

    n.setPrev(before);
    n.setNext(after);
    before.setNext(n);
    after.setPrev(n);
  }

  public void removeNode(int index){} //Removees a node at an index

  public String toString(){
    Node current = head.Next();
    String s = "";
    do {
        s += current.getData().toString();
        current = current.Next();
    }while(current.Next() != null);

    s += tail.getData().toString();
    return s;
  }

}
