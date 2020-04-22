import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
  
    Scanner in = new Scanner(System.in);
    System.out.prinln("Enter an integer: ");
    int number = in.nextInt();
    int j = number;
    int k = j;
    while(j > 0)
    {
      while(k > 0)
      {
        System.out.print("*");
        k = k-1;
      }
      System.out.println();
      j = j - 1;
    }
  }
}
