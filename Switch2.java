import java.util.Scanner;

public class Switch2 {
  public static void main(String[] args){
    System.out.println("Enter 'M' for MAN, and 'W' for WOMEN");
    Scanner x = new Scanner(System.in);
    String gender = x.next();
    switch (gender) {
      case "M":
      case "m":
      System.out.println("Is a Man!");
        break;
        case "W":
        case "w":
        System.out.println("Is a Women!");
        break;
      default:
      System.out.println("Please enter 'M' or 'W'");
        break;
    }
  }
}
