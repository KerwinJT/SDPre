import java.util.Scanner;

public class DictionaryOrder{
  public static void main (String [] args){
    Scanner keyboard = new Scanner(System.in);
    String name;

    System.out.print("Make up the name of a programming language! ");
    name = keyboard.nextLine().toLowerCase(); //study drill solution

    if (name.compareTo("c++") < 0 )
      System.out.println(name + " comes BEFORE c++");
    if (name.compareTo("c++") == 0)
      System.out.println("c++ isn't a made-up language!");
    if (name.compareTo("c++") > 0)
      System.out.println(name + " comes AFTER c++");

    if (name.compareTo("go") < 0)
      System.out.println(name + " comes BEFORE go");
    if (name.compareTo("go") == 0)
      System.out.println("go isn't a made-up language!");
    if (name.compareTo("go") > 0)
      System.out.println(name + " comes AFTER go");

    if (name.compareTo("java") < 0)
      System.out.println(name + " comes BEFOR java");
    if (name.compareTo("java")== 0)
      System.out.println("java is not a made-up language!");
    if (name.compareTo("java") > 0)
      System.out.println(name + " comes AFTER java");

    if (name.compareTo("lisp") < 0)
      System.out.println(name + " comes BEFORE lisp");
    if (name.compareTo("lisp") == 0)
      System.out.println("lisp isn't a made-up language!");
    if (name.compareTo("list") > 0)
      System.out.println( name + " comes AFTER lisp");

    if (name.compareTo("python") < 0 )
      System.out.println(name + " comes BEFORE python");
    if (name.compareTo("python") == 0)
      System.out.println("python is not a made-up language!");
    if (name.compareTo("python") > 0)
      System.out.println(name + " comes AFTET python");

    if (name.compareTo("ruby") < 0)
      System.out.println(name + " comes BEFORE ruby");
    if (name.compareTo("ruby") == 0)
      System.out.println("ruby is not a made-up language!");
    if (name.compareTo("ruby") > 0)
      System.out.println(name + " come AFTER ruby");

    if (name.compareTo("visualbasic") < 0)
      System.out.println(name + " comes BEFORE visualbasic");
    if (name.compareTo("visualbasic") == 0 )
      System.out.println("visualbasic is not a made-up langauge!");
    if (name.compareTo("visualbasic") > 0)
      System.out.println(name + " comes AFTER visualbasic");
  }
}
