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
public class punto4 {
    public static void main(String[] args) {
         
        int precio, cantidad, numero3 , numero4 ,suma , multiplicacion;
      
          Scanner opcion = new Scanner(System.in);
            
            System.out.println("Digite el precio de un articulo con un valor entero :");
             precio = opcion.nextInt();
             System.out.println("Digite la cantidad de productos :");
             cantidad = opcion.nextInt();
             
             
                           
          
     multiplicacion = precio*cantidad ; 
       System.out.println("Lo que debe abonar es :"+multiplicacion);
     
     
    
        
        
        
        
    }
    
}
    

