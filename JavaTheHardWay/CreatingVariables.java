public class CreatingVariables {
  public static void main (String [] args){
    int x, y, age;
    double seconds, e, checking;
    String firstName, lastName, title;

    x = 10;
    y = 400;
    age = 39;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    System.out.println("The variable x contain " + x);
    System.out.println( "The value " + y + " is stored in the variable y.");
    System.out.println( "The experiment took " + seconds + " seconds.");
    System.out.println( "A favorite irrational # is Euler's number: " + e);
    System.out.println( "Hopefully you have more than $" + e + "!");
    System.out.println( "My name's " + title + " " + firstName + lastName);

    //study drill solutions
    int studyInt = 10;
    double studyDouble = 12.345;
    String firstStudyString = "This is a ";
    String secondStudyString = "test!";

    System.out.println("The study integer is " + studyInt + ". And, the study double is " + studyDouble);
    System.out.println(firstStudyString + secondStudyString);
  }
}
