import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter text: ");
    String txt = in.nextLine();

    int[] hash = new int[123];

    int length = txt.length();

    //pre compute
    for(int i = 0; i < length; i++){
      hash[txt.charAt(i)]++;
    }

    System.out.print("Enter number of query: ");
    int q = in.nextInt();

    for(int i = 0; i < q; i++){
      System.out.print("Enter character no " + (i+1) + ": ");
      char ch = in.next().charAt(0);

      System.out.println(ch + " -> " + hash[ch]);
    }
  }
}
