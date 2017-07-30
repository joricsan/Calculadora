package calculadora;
import java.util.Scanner;

public class Calculadora {
           
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("------- CALCULADORA ------");
    System.out.println(" ");
    System.out.println(" 1 - SOMA");
    System.out.println(" 2 - SUBTRAÇÃO");
    System.out.println(" 3 - MULTIPLICAÇÃO");
    System.out.println(" 4 - DIVISÃO");
    System.out.println(" 5 - SAIR");
    System.out.println(" ");
    
             
      //int resutado;
      Scanner tec = new Scanner(System.in);
      System.out.print("Escolha a operação matemática = ");
      int opcao = tec.nextInt();
      String tipo; 
     
                switch (opcao) {
                    case 1:
                        Soma.somar();
                        break;
                   case 2:
                        Subtracao.subtrair();
                        break;
       
                    case 3:
                        Multiplicacao.multiplicar();
                        break;
                    case 4:
                        Divisao.dividir();
                        break;
                    case 5:
                        tipo = "Sair";
                        break;
                    default:
                        tipo = "Escolha uma opção";
                        break;
                                  
                }
            }
}