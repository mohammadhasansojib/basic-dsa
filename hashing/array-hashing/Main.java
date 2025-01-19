import java.util.Scanner;

class Main{
  private static int max(int[] arr){
    int length = arr.length;
    int max = arr[0];

    for(int i = 0; i < length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }

    return max;
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the array size: ");
    int n = input.nextInt();

    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      System.out.print("arr[" + i + "]: ");
      arr[i] = input.nextInt();
    }

    int max = max(arr);
    int[] hash = new int[max+1];

    for(int i = 0; i < n; i++){
      hash[arr[i]]++;
    }

    System.out.print("Enter the number of query: ");
    int q = input.nextInt();
    for(int i = 0; i < q; i++){
      int num = input.nextInt();
      //fetch
      if(num < 0 || num > max+1){
        System.out.println("Index out of bounds, try another number");
      }else{
        System.out.println(num + " -> " + hash[num]);
      }
    }

  }
}
