
package Operacion;

import java.util.Scanner;


public class Procedimiento {
   int num1, num2, suma, resta;
   
   Scanner in = new Scanner(System.in);
   
    public void leer(){
        System.out.println("Numero uno");
       num1 = in.nextInt();
       
       System.out.println("Numero dos");
       num2 = in.nextInt();
    }
    
    public void sumar(){
        suma = num1+num2;
    }
    
     public void restar(){
         resta = num1-num2;
     }
}
