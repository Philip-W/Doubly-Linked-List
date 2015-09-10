
//Node class that hodes the data and information about which other
//nodes it is connected to. This one is modified for a double linked list.

public class Node {

  private Object data;
  private Node next;
  private Node prev;

  public Node(Object o){
    next = null;
    prev = null;
    data = o;
  }


  public Object getData() { return data; }

  public Node Next(){ return next; }

  public void setNext(Node k) { next = k; }

  public Prev() { return prev; }

  public setPrev(Node k) { prev = k; }
}
