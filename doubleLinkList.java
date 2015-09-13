
public class doubleLinkList{

  private Node head; //first element
  private Node tail; //second element
  private int size;

  public doubleLinkList(){
    //head node acts as a pointer to the rest of the list.
    Node h = new Node(null);
    head = h;
    tail = h;
}

  public Node getHead(){
    //returns head, though this is null so is only a pointer to the first real
    //value in the list.
    return head;
  }

  public Node getTail() { return tail; }// returns the last element in the list.

  public int getSize() { return size; }// returns the number of Nodes in the list
                                       // limits the size!
  public void addToTail(Object o){
    //adds a Node to the end of the list, unlike the head the tail != null
    //used to make exceptions in addNode easier and for general appending.
    Node n = new Node(o);
    tail.setNext(n);
    n.setPrev(tail);
    n.setNext(null);
    tail = n;
    size++;

  }


  public void addNode(Object o, int index){
    //Inserts a Node after the given index (might bug due to null head - fixed)
    //if the index is > size, it will be appended to the end of the list.

    Node n = new Node(o);
    Node before = head;
    Node after;

    if (index < 0){
      throw new IndexOutOfBoundsException("Index "+ index + " is negative!");
    }

    if (size == 0 || index >= size){
      addToTail(o);
      return;
    }

    for (int i = 0; i <index && before.Next() != null; ++i){
      before = before.Next();
    }
    after = before.Next();

    n.setPrev(before);
    n.setNext(after);
    before.setNext(n);
    after.setPrev(n);
    size++;
  }

  public void removeNode(int index){
    //head index = 0, head.Next() = 1.
    if (index < 1 || index > size){
      throw new IndexOutOfBoundsException();
    }
    Node current = head;
    for (int i = 1; i < index; ++i){
      current = current.Next();
    }
    Node nxt = current.Next().Next();
    current.setNext(nxt);
    nxt.setPrev(current);

  }

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
