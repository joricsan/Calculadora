/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author ricardo
 */
public class Divisao {
    // TODO code application logic here
        public static void dividir(){
               
        Scanner calc = new Scanner(System.in);
        
        System.out.println("Primeiro número: ");
        float n1 = calc.nextFloat();
        System.out.println("Segundo número: ");
        float n2 = calc.nextFloat();
        
       
        float divisao = n1 / n2;
                
                
        System.out.println("RESULTADO: " + divisao);
    }
    
    
    
}
