class Node{
  int data;
  Node next;

  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

class Stk{
  Node top = null;

  public void push(int data){
    if(top == null){
      Node temp = new Node(data);
      top = temp;
    }else{
      Node temp = new Node(data);
      temp.next = top;
      top = temp;
    }
  }

  public void pop(){
    if(top == null){
      System.out.println("Underflow Condition.");
    }else{
      this.top = this.top.next;
    }
  }

  public int peek(){
    if(top == null)
      return 0;
    return top.data;
  }

  public boolean isEmpty(){
    if(top == null)
      return true;
    return false;
  }

  public void display(){
    Node temp = top;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}

class Stack{
  public static void main(String[] args){
    Stk s1 = new Stk();
    s1.push(40);
    s1.push(84);
    s1.push(34);
    s1.display();
    System.out.println("");
    s1.pop();
    s1.display();
    System.out.println("");
    s1.push(76);
    s1.push(87);
    s1.display();

    System.out.println("Peek data: " + s1.peek());
    System.out.println("isEmpty: " + s1.isEmpty());
    s1.pop();
    s1.pop();
    s1.pop();
    s1.pop();
    s1.pop();
    System.out.println("isEmpty: " + s1.isEmpty());
  }
}
