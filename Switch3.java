import java.util.Scanner;
public class Switch3 {
  public static void main(String[] args) {
    System.out.println("Enter any vowel/consonant");
    Scanner x = new Scanner(System.in);
    String letter = x.next();
    switch (letter) {
      case "a":
      case "e":
      case "i":
      case "o":
      case "u": 
      case "A":
      case "E":
      case "I":
      case "O":
      case "U": 
      System.out.println("That is an vowel");
        break;
      default:
      System.out.println("That is a consonant");
        break;
    }
  }
}
