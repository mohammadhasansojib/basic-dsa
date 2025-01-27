class Main{
  private static void bubbleSort(int[] arr, int n){
    for(int i = 0; i < n-1; i++){
      for(int j = 0; j < n-1-i; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  public static void main(String[] args){
    int[] arr = {50,34,23,65,28,38};
    int length = arr.length;

    System.out.print("Before Sorting:");
    for(int i = 0; i < length; i++){
      System.out.print(" " + arr[i]);
    }

    bubbleSort(arr, length);

    System.out.println();
    System.out.print("After Sorting:");
    for(int i = 0; i < length; i++){
      System.out.print(" " + arr[i]);
    }

    System.out.println();
  }
}
