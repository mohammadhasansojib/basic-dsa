class Main{
  private static void selectionSort(int n, int[] arr){
    for(int i = 0; i < n-1; i++){
      int minIndex = i;
      for(int j = i; j < n; j++){
        if(arr[minIndex] > arr[j]){
          minIndex = j;
        }
      }
      swap(arr, i, minIndex);
    }
  }
  private static void swap(int[] arr, int largeItemIndex, int smallItemIndex){
    int temp = arr[largeItemIndex];
    arr[largeItemIndex] = arr[smallItemIndex];
    arr[smallItemIndex] = temp;
  }
  public static void main(String[] args){
    int[] arr = {40,32,75,12,38,43};
    int length = arr.length;
    
    System.out.print("Before sorting:");
    for(int i = 0; i < length; i++){
      System.out.print(" " + arr[i]);
    }

    selectionSort(length, arr);

    System.out.println();
    System.out.print("After sorting:");
    for(int i = 0; i < length; i++){
      System.out.print(" " + arr[i]);
    }
    System.out.println();

  }
}
