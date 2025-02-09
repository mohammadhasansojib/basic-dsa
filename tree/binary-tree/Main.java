class TreeNode{
  // Data declaration & left, right initializing
  char data;
  TreeNode left = null;
  TreeNode right = null;
  public TreeNode(char data){
    // data initializing
    this.data = data;
  }
  // Create new Node
  public TreeNode createNode(char data){
    return new TreeNode(data);
  }
}

class Main{
  public static void main(String[] args){
    // Root node creation
    TreeNode R = new TreeNode('R');

    // internal & leaf node creation
    TreeNode nodeA = R.createNode('A');
    TreeNode nodeB = R.createNode('B');
    TreeNode nodeC = R.createNode('C');
    TreeNode nodeD = R.createNode('D');
    TreeNode nodeE = R.createNode('E');
    TreeNode nodeF = R.createNode('F');

    // Lining nodes
      // Root node child
    R.left = nodeA;
    R.right = nodeB;
      // nodeA child
    nodeA.left = nodeC;
    nodeA.right = nodeD;
      // nodeB child
    nodeB.left = nodeE;
    nodeB.right = nodeF;

    // Display
    System.out.println("R.left.right: " + R.left.right.data);
  }
}
