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
public class punto1 {
    public static void main(String[] args) {
         
        Double numero1, numero2, numero3 ;
      
          Scanner opcion = new Scanner(System.in);
            
            numero1= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el numero 1"));
             numero2= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el numero 2"));
             numero3= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el numero 3"));
             
                  if(numero1>numero2 && numero1>numero3){
                      JOptionPane.showMessageDialog(null,"El numero 1 es mayor  ");
                      
                  }else 
                      if(numero2>numero1 && numero2>numero3){
                      JOptionPane.showMessageDialog(null,"El numero 2 es mayor  ");
                    
                      }else
                          if(numero3>numero1 && numero3>numero2){
                      JOptionPane.showMessageDialog(null,"El numero 3 es mayor  ");
                          }
                  
                     
          
     
     
    
        
        
        
        
    }
    
}
    

