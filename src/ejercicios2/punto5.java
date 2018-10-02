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
public class punto5 {
      public static void main(String[] args) {
         
        Double numero1, numero2, numero3 ;
        String nombre;
      
          Scanner opcion = new Scanner(System.in);
            
            numero1= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite un numero entero de 3 cifras"));
             
             
                  if(numero1>100 && numero1<1000){
                      JOptionPane.showMessageDialog(null,"El numero tiene 3 cifras  ");
                      
                  }else 
                      if(numero1>10 && numero1<100){
                      JOptionPane.showMessageDialog(null,"El numero tiene 2 cifras  ");  
                      }else 
                      if(numero1>1 && numero1<10){
                      JOptionPane.showMessageDialog(null,"El numero tiene 1 cifra  ");
                     
          
                      }
     
    
}
