class Node{
  int data;
  Node next;
  int num;

  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

class Edit{

  private static Node ll(int[] arr){
    Node head = new Node(arr[0]);
    Node mover = head;
    int size = arr.length;

    for(int i = 1; i < size; i++){
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }

    return head;
  }

  private static void insert(Node head, int data, int position){
    Node head_holder = head;
    Node prev = head_holder;
    int count = 0;

    while(head_holder != null){
      if(count == position){
        Node temp = new Node(data);
        temp.next = head_holder;
        prev.next = temp;
        break;
      }
      prev = head_holder;
      head_holder = head_holder.next;
      count++;
    }

    System.out.println("Inserted " + data + " in position " + position);

  }

  private static void delete(Node head, int position){
    Node temp = head;
    int count = 0;
    while(temp != null){
      if(count-1 == position){
        temp.next = temp.next;
      }

      temp = temp.next;
      count++;
    }
  }

  public static void main(String[] args){
    int[] arr = {10,20,30,40,50};
  
    Node head = ll(arr);

    Node temp = head;

    System.out.println("Before Insertion: ");
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }

    temp = head;
    insert(temp, 56, 2);
    delete(temp, 3);
    System.out.println("After Insertion: ");
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }

    

  }
}
