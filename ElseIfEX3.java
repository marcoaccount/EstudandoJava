public class ElseIfEX3 {
  public static void main(String[] args) {
    int peça = 100;
    int quantidade = peça * 11;
    if(quantidade > 1000){
      double desconto = quantidade - (quantidade * 0.1);
      System.out.println("O valor deu "+quantidade+", mas com desconto fica "+desconto);
    }else{
      System.out.println(quantidade);
    }
  }
}
