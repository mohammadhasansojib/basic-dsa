class Main{
  private static void mergeSort(int s, int e,int[] arr){
    // if array's first & last index are same, then return
    if(s >= e)
      return;

    // calculating the mid index of the array
    int mid = (s+e)/2;

    // Divide arrays into two parts recursively
    mergeSort(s, mid, arr);
    mergeSort(mid+1, e, arr);

    // After dividing, merge the array sortedly
    merge(s, e, arr);
  }
  private static void merge(int s, int e, int[] arr){

    // Created a temporary array store sorted values
    int tempLength = (e-s)+1;
    int[] tempArr = new int[tempLength];

    // copy the low, mid & high index of the array to track and put in temp array
    int left = s;
    int mid = (s+e)/2;
    int right = mid+1;

    // Storing the values to tempArr sortedly
    int q = 0;
    while(left <= mid && right <= e){
      if(arr[left] < arr[right]){
        tempArr[q++] = arr[left++];
      }else{
        tempArr[q++] = arr[right++];
      }
    }

    // if any of left array value still exist then put to the temp array
    while(left <= mid){
      tempArr[q++] = arr[left++];
    }
    // if any of right array value still exist then put to the temp array
    while(right <= e){
      tempArr[q++] = arr[right++];
    }

    // copy the value from temp array to original array
    q = 0;
    for(int i = s; i <= e; i++){
      arr[i] = tempArr[q++];
    }
  }
  public static void main(String[] args){

    // Given array & length
    int[] arr = {30,21,59,43,92,34,9};
    int n = arr.length;
    
    // Traversal array before sorting
    System.out.print("Before Sorting:");
    for(int i = 0; i < n; i++){
      System.out.print(" " + arr[i]);
    }

    // Sorting the array using merge sort algorithm
    mergeSort(0,n-1,arr);

    // Traversal array after sorting
    System.out.println();
    System.out.print("After Sorting:");
    for(int i = 0; i < n; i++){
      System.out.print(" " + arr[i]);
    }
    System.out.println();
  }
}
