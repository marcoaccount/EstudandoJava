package exercicios;
import java.util.Scanner;
public class Ex1 {
  public static void main(String[] args){
    System.out.println("Qual ano você nasceu?");
    Scanner data = new Scanner(System.in);
    int x = data.nextInt();
    if(x<=2008){
      System.out.println("Já pode votar");
    }else{
      System.out.println("Não pode votar");
    }
  }
}
