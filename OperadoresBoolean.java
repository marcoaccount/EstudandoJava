public class OperadoresBoolean {
  public static void main(String[] args) {
  // && = and / || = or

  //Para entrar em uma cidade , é preciso ter mais de 22 anos, e ter R$5000.00 na conta
  int Idade = 28;
  double Dinheiro = 6000.00;
  int Idade2 = 20;
  double Dinheiro2 = 4000.00;
  boolean Certo = Idade > 22 && Dinheiro > 5000.00;
  boolean Errado = Idade2 > 22 && Dinheiro2 > 5000.00;

  System.out.println(Certo);
  System.out.println(Errado);

  //Quero comprar um macaco de estimação, o valor é 750, na conta 1 tenho 200, na conta 2 tenho 2000
  double Conta1 = 200.00;
  double Conta2 = 2000.00;
  double PreçoMacaco = 750.00;
  boolean isPagavel = Conta1 > PreçoMacaco || Conta2 > PreçoMacaco;
  System.out.println(isPagavel);
  }
}
