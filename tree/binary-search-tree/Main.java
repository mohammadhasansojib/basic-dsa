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

  // pre-order-traverse method
  public ArrayList<Integer> pre_order_traverse(){
    ArrayList<Integer> elements = new ArrayList<>();

    // root traverse
    elements.add(this.data);

    // left sub tree traverse
    if(this.left != null)
      elements.addAll(this.left.pre_order_traverse());

    // right sub tree traverse
    if(this.right != null)
      elements.addAll(this.right.pre_order_traverse());

    return elements;
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

  // post-order-traverse method
  public ArrayList<Integer> post_order_traverse(){
    ArrayList<Integer> elements = new ArrayList<>();

    // left sub tree traverse
    if(this.left != null)
      elements.addAll(this.left.post_order_traverse());

    // right sub tree traverse
    if(this.right != null)
      elements.addAll(this.right.post_order_traverse());

    // root traverse
    elements.add(this.data);

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

  // Minimum value finding method
  public int find_min(){
    if(this.left == null)
      return this.data;
    else
     return this.left.find_min();
  }

  // Maximum value finding method
  public int find_max(){
    if(this.right == null)
      return this.data;
    else
      return this.right.find_max();
  }

  // calculate sum method
  public int calculate_sum(){
    if(this.left == null && this.right == null)
      return this.data;
    else if(this.left == null)
      return this.data + this.right.calculate_sum();
    else if(this.right == null)
      return this.data + this.left.calculate_sum();
    else
      return this.data + this.left.calculate_sum() + this.right.calculate_sum();
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

    // tree traversal using pre-order-traversal method
    System.out.println("Pre order traversal: ");
    System.out.println(root.pre_order_traverse());

    // tree traversal using in-order-traverse method
    System.out.println("In order traversal: ");
    System.out.println(root.in_order_traverse());

    // tree traversal using post-order-traverse method
    System.out.println("Post order traversal: ");
    System.out.println(root.post_order_traverse());

    System.out.println();

    // searching in tree
    System.out.println("50 exist in tree : " + root.search(50));

    System.out.println();

    // minimum value in tree
    System.out.println("Minimum value in tree: " + root.find_min());

    // maximum value in tree
    System.out.println("Maximum vlaue in tree: " + root.find_max());

    System.out.println();

    // calculate sum of every element in tree
    System.out.println("Sum of tree: " + root.calculate_sum());
  }
}
