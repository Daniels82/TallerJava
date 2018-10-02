/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTE
 */
public class punto2 {
     public static void main(String[] args) {
         
        Double numero1, numero2, numero3 ;
      
          Scanner opcion = new Scanner(System.in);
            
            numero1= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el numero 1"));
             
             
                  if(numero1>0){
                      JOptionPane.showMessageDialog(null,"El numero es positivo  ");
                      
                  }else 
                      if(numero1== 0){
                          
                              JOptionPane.showMessageDialog(null,"El numero es cero  ");
                          }                 
                      else 
                        if(numero1<0){
                          JOptionPane.showMessageDialog(null,"El numero es negativo  ");
        }
                  
                     
          
     
     
    
        
        
        
        
    }
    
}
    

    

