class Main{
  private static void insertionSort(int n, int[] arr){
    for(int i = 0; i < n; i++){
      for(int j = i; j > 0; j--){
        //if the item of index j is less than the item of index j-1, then swap these
        if(arr[j] < arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }else{
        //if swap not happened that mean the item is in correct position, so quit the loop
        break;
        }
      }
    }
  }
  public static void main(String[] args){
    int[] arr = {39,21,25,75,34,54};
    int n = arr.length;
    
    //Before sorting the array traversal
    System.out.print("Before Sorting:");
    for(int i = 0; i < n; i++){
      System.out.print(" " + arr[i]);
    }

    //sorting the array by insertion sort
    insertionSort(n, arr);

    //After sorting the array traversal
    System.out.println();
    System.out.print("After Sorting:");
    for(int i = 0; i < n; i++){
      System.out.print(" " + arr[i]);
    }
    System.out.println();
  }
}
