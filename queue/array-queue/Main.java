class Queue{
  int size = 3;
  private int[] queue = new int[size];
  int f = -1; // f -> front
  int r = -1; // r -> rear

// Enqueue method
  public void enqueue(int data){
    if(f == -1){
      f = r = 0;
      queue[r] = data;
      System.out.println("Enqueued: " + data);
    }else if(r == size-1){
      System.out.println("Enqueue failed, Overloading condition.");
    }else{
      r++;
      queue[r] = data;
      System.out.println("Enqueued: " + data);
    }
  }
// Dequeue method
  public void dequeue(){
    if(r == -1){
      System.out.print("Dequeue failed, Underflow condition.");
    }else if(f == size-1){
      System.out.println("Dequeued: " + queue[f]);
      f = r = -1;
    }else{
      System.out.println("Dequeued: " + queue[f]);
      f++;
    }
  }
// Traverse method
  public void display(){
    int i = f;
    if(r == -1){
      System.out.println("Display failed, Underflow condition.");
    }else{
      System.out.print("Queue: ");
      while(i <= r){
        System.out.print(queue[i] + " ");
        i++;
      }
      System.out.println("");
    }
  }
// Peek method
  public int peek(){
    if(r == -1){
      System.out.println("Peek fetch failed, underflow condition.");
      return 0;
    }else{
      return queue[f];
    }
  }
// isEmpty method
  public boolean isEmpty(){
    if(r == -1)
      return true;
    return false;
  }
// isFull method
  public boolean isFull(){
    if(r == size-1)
      return true;
    return false;
  }
}

class Main{
  public static void main(String[] args){
    Queue q1 = new Queue();

    q1.enqueue(34);
    q1.enqueue(74);
    q1.enqueue(45);
    q1.enqueue(87);
      
    System.out.println("isFull: " + q1.isFull());

    q1.display();

    q1.dequeue();

    q1.display();

    System.out.println("peek: " + q1.peek());

  }
}
