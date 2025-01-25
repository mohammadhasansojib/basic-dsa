import java.util.HashMap;
import java.util.Scanner;

class Main{
  //frequecy computation & array value storing to HashMap
  private static void compute(int n, int[] arr, HashMap<Integer, Integer> items){
    for(int i = 0; i < n; i++){
      int count = items.getOrDefault(arr[i], 0);
      items.put(arr[i], count+1);
    }
  }
  // array item input taking
  private static void arrayInput(int n, int[] arr){
    Scanner in = new Scanner(System.in);
    for(int i = 0; i < n; i++){
      System.out.print("arr[" + i + "]: ");
      arr[i] = in.nextInt();
    }
  }

  public static void main(String[] args){
    // creating objects from Scanner & HashMap class
    Scanner in = new Scanner(System.in);
    HashMap<Integer, Integer> items = new HashMap<Integer, Integer>();

    // input taking of array size(n)
    System.out.print("Enter the size of array: ");
    int n = in.nextInt();

    //array item input taking
    int[] arr = new int[n];
    arrayInput(n, arr);

    // computation of frequency & store to HashMap
    compute(n, arr, items);

    // array display
    System.out.print("Array:");
    for(int i = 0; i < n; i++){
      System.out.print(" " + arr[i]);
    }

    System.out.println();

    // input taking of no of query & the key looking for which frequency and fetching the frequency
    System.out.print("Enter the no of query: ");
    int q = in.nextInt();
    for(int i = 0; i < q; i++){
      System.out.print("Query: ");
      int key = in.nextInt();
      if(items.get(key) == null)
        System.out.println(key + " appear " + 0 + " time in the array.");
      else
        System.out.println(key + " appear " + items.get(key) + " times in the array.");
    }

    in.close();

  }
}
