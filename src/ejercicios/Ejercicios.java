/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author SOPORTE
 */
public class Ejercicios {

         
    public static void main(String[] args) {
         
        int lado,  multiplicacion;
      
          Scanner opcion = new Scanner(System.in);
            
            System.out.println("Digite el lado de un cuadrado :");
             lado = opcion.nextInt();
             
                           
 
     multiplicacion=lado*lado*lado*lado; 
       System.out.println("El perimetro del cuadrado es :"+multiplicacion);
     
     
    
        
        
        
        
    }
    
}
