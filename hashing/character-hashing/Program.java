import java.util.Scanner;

class Program{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the text: ");
    String txt = in.nextLine();

    int length = txt.length();

    int[] hash = new int[26];

    //pre compute
    for(int i = 0; i < length; i++){
      hash[txt.charAt(i)-'a']++;
    }

    System.out.print("Enter the no of query: ");
    int q = in.nextInt();

    for(int i = 0; i < q; i++){
      System.out.print("character: ");
      char ch = in.next().charAt(0);
      System.out.println(ch + " -> " + hash[ch-'a']);
    }
    
  }
}
