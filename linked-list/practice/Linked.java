class Node{
  int data;
  Node next;

  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

class Linked{
  public static void main(String[] args){
    Node l1 = new Node(10);
    Node head = l1;
    Node mover = head;

    int num = l1.data;

    for(int i = 1; i < 5; i++){
      num += 10;
      Node temp = new Node(num);
      mover.next = temp;
      mover = temp;
    }

    Node temp = head;
    int count = 0;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
      count++;
    }
    System.out.println("Size of Linked List: " + count);

    
  }
}
