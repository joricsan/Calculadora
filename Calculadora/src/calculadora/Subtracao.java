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
public class Subtracao {
    
    
        // TODO code application logic here
        public static void subtrair(){
               
        Scanner calc = new Scanner(System.in);
        
        System.out.println("Primeiro número: ");
        int n1 = calc.nextInt();
        System.out.println("Segundo número: ");
        int n2 = calc.nextInt();
        
       
        int subtracao = n1 - n2;
                
        System.out.println("RESULTADO: " + subtracao);
    }
    }
