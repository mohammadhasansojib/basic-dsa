class Main{
  private static int linearSearch(int[] arr, int target){
      for(int i = 0; i < arr.length; i++){
        if(arr[i] == target)
          return i;
      }

      return -1;
  }
  public static void main(String[] args){
    // Given array
    int[] arr = {40,32,92,56,12,67};
    int target = 56;

    // Display the array
    System.out.print("Array:");
    for(int i = 0; i < arr.length; i++){
      System.out.print(" " + arr[i]);
    }
    System.out.println("\nTargeted item: " + target);

    // Linear Search
    int index = linearSearch(arr, target);

    // Result
    if(index != -1)
      System.out.println("Index of targeted item: " + index);
    else
      System.out.println("Item no found.");
  }
}
