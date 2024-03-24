import java.util.Scanner;
public class Scanner2 {
  public static void main(String[] args){
    Scanner idade = new Scanner(System.in);
    System.out.println("Qual sua idade?");
    int x = idade.nextInt();
    if(x>=18){
      System.out.println("MAIOR DE IDADE");
    }else if(x>=14 && x<18){
      System.out.println("ADOLECENTE");
    }else{
      System.out.println("CRIANÇA");
    }
  }
}
