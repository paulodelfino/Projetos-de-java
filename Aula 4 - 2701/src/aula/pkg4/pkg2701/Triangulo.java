
package aula.pkg4.pkg2701;

import javax.swing.JOptionPane;


public class Triangulo {
    
    public static void main(String[] args) {
        
        int c1 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu primeiro numero"));
        int c2 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu segundo numero"));
        int h = Integer.parseInt(JOptionPane.showInputDialog("Digite seu terceiro numero"));
        
       String teste;
        
        c1 = c1 * c1;
        c2 = c2 * c2;
        h = h*h;
        
        if (h == ( c1 + c2)){
            teste = " É triangulo retangulo";
                
        
   
    } else
            teste=" Não é triangulo retangulo";
        
         JOptionPane.showMessageDialog(null, "A resposta é" + teste, "Teste", JOptionPane.PLAIN_MESSAGE);
}
    
   
}
