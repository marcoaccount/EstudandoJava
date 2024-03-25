package exercicios;
import java.util.Scanner;
public class EXYT {
  public static void main(String[] args) {
    System.out.println("Quanto vc ganha?");
  Scanner x = new Scanner(System.in);
  double salario = x.nextDouble();
  double imposto1 = salario - (salario*.097);
  double imposto2 = salario  - (salario*.37);
  double imposto3 = salario - (salario*.49);
  if(salario<=34700){
    System.out.println("Contando com os impostos você ganha: "+imposto1);
  }else if(salario<=68500 && salario>34700){
    System.out.println("Contando com os impostos você ganha: "+imposto2);
  }else{
    System.out.println("Contando com os impostos você ganha: "+imposto3);
  }
  }
}
