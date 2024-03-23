import java.util.Scanner;
public class ScannerElseIF {
  public static void main(String[] args) {
    Scanner peça = new Scanner(System.in);
    System.out.println("Escolha a quantidade");
    int x = peça.nextInt();
    if((x*200)>1000){
      System.out.println("sua compra deu "+(x*200)+", mas com o desconto fica "+(x*200-(x*200*0.1)));
    }else{
      System.out.println("fica "+(x*200)+" sem desconto");
    }
  }
}
