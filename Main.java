import java.util.Scanner;
/**
 * a program to divide two integers and tell the user the remainder
 * @author Darian Pajic
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user to enter the first integer
  System.out.println("Please enter in two integers, on seperate lines, to divide. ");
  int x = input.nextInt();
  int y = input.nextInt();

  // divide the two integers to find the sum
  int z = (x / y);
  int v = (x % y);

  // tell the user their answer
  System.out.println(x + "/" + y + " is " + z + " with a remainder of " + v + ".");


  }
}
