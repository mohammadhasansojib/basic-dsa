class Node{
  int data;
  Node next;

  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

class Queue{
  Node head = null;
  Node tail = null;

  Node front = null;
  Node rear = null;

  Node mover = null;

// Enqueue method
  public void enqueue(int data){
    Node temp = new Node(data);

    if(head == null){
      head = tail = temp;
      front = rear = temp;
    }else{
      tail.next = temp;
      tail = rear = temp;
    }

    System.out.println("Enqueued: " + data);
  }
// Dequeue method
  public void dequeue(){
    if(head == null){
      System.out.println("Dequeue failed, underloading condition.");
    }else{
      System.out.println("Dequeued: " + front.data);
      front = front.next;
      head = front;
    }
  }
// peek method
  public void peek(){
    if(head == null)
      System.out.println("No peek item, underloading condition.");
    else
      System.out.println("peek: " + head.data);
  }
// isEmpty method
  public void isEmpty(){
    if(head == null)
      System.out.println("Queue is empty.");
    else
      System.out.println("Queue is not empty.");
  }
// Traverse method
  public void display(){
    System.out.print("\nQueue:");
    Node temp = head;
    while(temp != null){
      System.out.print(" " + temp.data);
      temp = temp.next;
    }
    System.out.println("");
  }
  
}

class Main{
  public static void main(String[] args){
    Queue q1 = new Queue();
    q1.isEmpty();
    q1.enqueue(40);
    q1.enqueue(30);
    q1.isEmpty();

    q1.display();

    q1.peek();

    q1.dequeue();
    q1.dequeue();
    q1.dequeue();

    q1.peek();

    q1.enqueue(75);
    q1.enqueue(34);

    q1.display();
    q1.peek();
    q1.isEmpty();
  }
}
