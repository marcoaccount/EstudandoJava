package exercicios;
import java.util.Scanner;
public class Ex2 {
  public static void main(String[] args) {
    System.out.println("Digite a senha:");
  Scanner senha = new Scanner(System.in);
  int x = senha.nextInt();
  if(x==1234){
    System.out.println("SENHA CORRETA");
  }else{
    System.out.println("SENHA INCORETA");
  }
  }
}
