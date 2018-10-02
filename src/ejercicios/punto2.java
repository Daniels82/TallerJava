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
public class punto2 {
    public static void main(String[] args) {
         
        int numero1, numero2, numero3 , numero4 ,suma , multiplicacion;
      
          Scanner opcion = new Scanner(System.in);
            
            System.out.println("Digite un numero :");
             numero1 = opcion.nextInt();
             System.out.println("Digite un numero :");
             numero2 = opcion.nextInt();
             System.out.println("Digite un numero :");
             numero3 = opcion.nextInt();
             System.out.println("Digite un numero :");
             numero4 = opcion.nextInt();
             
                           
           suma =numero1+numero2; 
       System.out.println("La suma es :"+suma);
 
     multiplicacion = numero3*numero4 ; 
       System.out.println("El producto es :"+multiplicacion);
     
     
    
        
        
        
        
    }
    
}
    

