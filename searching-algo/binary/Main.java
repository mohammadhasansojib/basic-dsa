class Main{
  private static int binarySearch(int[] arr, int target){
    int l = 0;
    int r = arr.length - 1;
    
    while(l <= r){
      int mid = (l+r)/2;
      if(arr[mid] == target)
        return mid;
      else if(arr[mid] < target)
        l = mid+1;
      else
        r = mid-1;
    }

    return -1;
  }
  public static void main(String[] args){
    // Given Array & length
    int[] arr = {1,2,3,4,5,6,7,8,9};
    int n = arr.length;

    // Array display
    System.out.print("Array:");
    for(int i = 0; i < n; i++){
      System.out.print(" " + arr[i]);
    }
    System.out.println();

    // Binary Search
    int index = binarySearch(arr, 7);

    // Display the result
    System.out.print("index of 7 is " + index);
  }
}
