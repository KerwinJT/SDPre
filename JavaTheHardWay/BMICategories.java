import java.util.Scanner;

public class BMICategories{
  public static void main (String [] args){
    Scanner keyboard = new Scanner(System.in);
    double bmi;

    double m, kg; //These lines are added to allow a person to calculate their BMI
                  //They are separated to show the additional code
    System.out.print("Your height in m: ");
    m = keyboard.nextDouble();

    System.out.print("Your weight in kg: ");
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);

    //System.out.print("Enter your BMI: ");
    //bmi = keyboard.nextDouble();

    System.out.print("BMI category: ");
    if (bmi < 15.0){
      System.out.println("very severely underweight");
    }
    else if (bmi <= 16 ){
      System.out.println(" severely underweight");
    }
    else if (bmi < 18.5){
      System.out.println("underweight");
    }
    else if (bmi < 25.0){
      System.out.println("normal weight");
    }
    else if (bmi < 30.0){
      System.out.println("overweight");
    }
    else if (bmi < 35.0){
      System.out.println("moderately obese");
    }
    else if (bmi < 40 ){
      System.out.println("severely obese");
    }
    else{
      System.out.println("very severely \"morbidly\" obese"); // removed / and replaced it with a space.
    }
  }
}
