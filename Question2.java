import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner height = new Scanner(System.in);
    System.out.println("Enter your height: ");
    double height = input.nextDouble();
    Scanner weight = new Scanner(System.in);
    System.out.println("Enter your weight: ");
    double weight = input.nextDouble();
    double bmi = weight/(height*height);
    System.out.println("BMI is: " + bmi);
  }
}
