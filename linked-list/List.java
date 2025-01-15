class Node{
  int data;
  Node next;

  Node(int data, Node next){
    this.data = data;
    this.next = next;
  }
  Node(int data){
    this.data = data;
    this.next = null;
  }
}

class List{
  private static Node ll(int[] arr){
    Node head = new Node(arr[0]);
    Node mover = head;

    for(int i = 1; i < arr.length; i++){
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }

    return head;
  }

  private static int lengthOfLL(Node ll){
    int count = 0;
    while(ll != null){
      count++;
      ll = ll.next;
    }
    return count;
  }

  public static void main(String[] args){
    int[] arr = {10,20,30,40};
    Node head = ll(arr);
    Node temp = head;

    System.out.println(lengthOfLL(temp));
  }
}
