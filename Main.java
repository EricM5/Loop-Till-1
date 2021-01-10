import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a number greater than 0: ");
    int number = in.nextInt();
    System.out.println();
    int repetitions = 0;
    while(true) {
      if (number <= 0) {
        System.out.print("Bad input! Number must be greater than 0!\nEnter a whole number greater than 0: ");
        number = in.nextInt(); 
        System.out.println();
      } 
      if (number > 0) {
        break;
      }
    }
    while (number > 1) {   
      if (number % 2 == 0) {
        number = number/2 ;
        System.out.println("Current Value: " + number);
        repetitions++;
      } else if (number % 2 == 1) {
        number *= 3;
        number++;
        System.out.println("Current Value: " + number);
        repetitions++;
      } 
    }
    System.out.println("\nThe final value is: " + number);
    System.out.println("Total number of repetitions: " + repetitions);
  }
}
