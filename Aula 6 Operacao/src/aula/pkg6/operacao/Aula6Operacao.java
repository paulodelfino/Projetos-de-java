
package aula.pkg6.operacao;

import javax.swing.JOptionPane;


public class Aula6Operacao {

    
    public static void main(String[] args) {
      
        String v1 = JOptionPane.showInputDialog("Digite PRIMEIRO numero"); 
        String v2 = JOptionPane.showInputDialog("Digite SEGUNDO  numero"); 
        String op = JOptionPane.showInputDialog("Digite a Operação");
        
        int n1 =Integer.parseInt(v1);
        int n2 =Integer.parseInt(v2);
        
        Calculadora calc = new Calculadora ();
        
        
        if (op.equals("+")){
            System.out.println( "O resultado é" +calc.soma(v1, v2));
    }
        
         if (op.equals("-")){
            System.out.println( "O resultado é" +(n1-n2));
        
         }
         
          if (op.equals("*")){
            System.out.println( "O resultado é" +(n1*n2));
          }
          
          // if (op.equals("/")){
           //System.out.println( "O resultado é" +(n1/n2));
            
            //Aconselhavel a usar o double para numeros depois da virgulas
           //double d = n1/n2;{
            //System.out.println("O Resultado é" +(d));
    }
    }

