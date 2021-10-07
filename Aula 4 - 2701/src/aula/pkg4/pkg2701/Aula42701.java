
package aula.pkg4.pkg2701;

import javax.swing.JOptionPane;


public class Aula42701 {

    
    public static void main(String[] args) {
       
         
         int n1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o primeiro numero"));   
         int n2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o segundo numero"));   
         int n3 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o terceiro numero"));   
            
          if (n1 > n2 && n2 > n3){
              
              JOptionPane.showMessageDialog(null, "N1 é maior!");
              
          }
          
            if (n2 > n3 && n3 > n2){
                
                JOptionPane.showMessageDialog(null, "N2 é maior!");
                
            }
                
                if (n3 > n1 && n3 > n2){
                    
                    JOptionPane.showMessageDialog(null, "N3 é maior!");
                    
                }
             
    }
        
    }
    

