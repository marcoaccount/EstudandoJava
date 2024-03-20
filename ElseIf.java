public class ElseIf {
  public static void main(String[] args){
    //Idade < 14 criança // Idade >= 14 && Idade <18 jovem // Idade >18 adulto
    int idade = 12;
    if (idade < 14){
      System.out.println("CRIANÇA");
    }else if(idade >=14 && idade < 18){
      System.out.println("JOVEM");
    }else{
      System.out.println("ADULTO");
    }
  }
}
