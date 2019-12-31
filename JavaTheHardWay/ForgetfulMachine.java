import java.util.Scanner;

public class ForgetfulMachine {
  public static void main (String [] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();

    System.out.println("Ent a number between 0.0 and 1.0.");
    keyboard.nextDouble();

    System.out.println("Is there anything you would like to say?");
    keyboard.next();

    //Study drill answers
    //When Scanner response is not of the proper type then the program throws an error.
  }
}
