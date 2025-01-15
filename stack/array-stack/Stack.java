class Stk{
  private int[] arr;
  private int size;
  private int top = -1;
  
  public Stk(int n){
    arr = new int[n];
    this.size = n;
  }

// push method
  public void push(int data){
    if(top == size-1){
      System.out.println("Overflow Condition.");
    }else{
      top++;
      this.arr[top] = data;
      System.out.println("Pushed " + data + " to Stack.");
    }
  }
// pop method
  public void pop(){
    if(top == -1){
      System.out.println("Underflow Condition.");
    }else{
      System.out.println("Poped " + this.arr[top] + " from stack.");
      top--;
    }
  }
// peek method
  public int peek(){
    if(top == -1){
      System.out.println("Underflow Condition.");
      return 0;
    }else{
      return this.arr[top];
    }
  }
// isEmpty method
  public boolean isEmpty(){
    if(top == -1){
      return true;
    }else{
      return false;
    }
  }
// isFull method
  public boolean isFull(){
    if(top == size-1){
      return true;
    }else{
      return false;
    }
  }
// Traverse method
  public void display(){
    for(int i = top; i >= 0; i--){
      System.out.println(this.arr[i]);
    }
  }

}

class Stack{
  public static void main(String[] args){
    Stk s1 = new Stk(5);
    s1.push(30);
    s1.push(87);
    s1.push(65);
    
    s1.display();

    s1.push(23);
    s1.push(76);
    s1.pop();
    s1.pop();

  }
}
