
package aula.pkg6;

import javax.swing.JOptionPane;


public class Aula6 {

    
    public static void main(String[] args)   
            
    {
        String [] numero = new String [5];
              
        for ( int x=0; x<=4; x++) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome");
        
          numero [x] = nome; }  
          
                                    
        
         for ( int x=0; x<=4; x++){
             System.out.println(numero [x]);
             
             
         }
    } 
    
}
