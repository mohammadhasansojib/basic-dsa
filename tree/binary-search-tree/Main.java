import java.util.ArrayList;

class BST_Node{
  int data;
  BST_Node left = null;
  BST_Node right = null;

  public BST_Node(int data){
    this.data = data;
  }

  // child addition method
  public void add_child(int data){
    if(this.data == data)
      return;

    if(data < this.data){
      // Add to left sub tree
      if(this.left != null)
        this.left.add_child(data);
      else
        this.left = new BST_Node(data);
    }else{
      // Add to right sub tree
      if(this.right != null)
        this.right.add_child(data);
      else
        this.right = new BST_Node(data);
    }

  }

  // in-order-traverse method
  public ArrayList<Integer> in_order_traverse(){
    ArrayList<Integer> elements = new ArrayList<>();

    // left sub tree traverse
    if(this.left != null)
      elements.addAll(this.left.in_order_traverse());

    // root traverse
    elements.add(this.data);

    // right sub tree traverse
    if(this.right != null)
      elements.addAll(this.right.in_order_traverse());

    return elements;
  }

  // Search method
  public boolean search(int target){
    if(target == this.data)
      return true;

    if(target < this.data){
      if(this.left != null){
        return this.left.search(target);
      }else{
        return false;
      }
    }else{
      if(this.right != null){
        return this.right.search(target);
      }else{
        return false;
      }
    }

  }
}

class Main{
  public static void main(String[] args){
    // Given array
    int[] arr = {40,32,65,94,23,12,54,84};

    // created the tree
    BST_Node root = new BST_Node(50);

    // child addition
    for(int item : arr){
      root.add_child(item);
    }

    // tree traversal using in-order-traverse method
    System.out.println(root.in_order_traverse());

    // searching in tree
    System.out.println("50 exist in tree : " + root.search(50));
  }
}
