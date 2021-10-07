
package aula.pkg10;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;


public class Forms extends JFrame implements ActionListener {
    
    JButton btn1;
    JTextField txt1, txt2; 
    
    public Forms () {
        
        getContentPane().setLayout(null);
        setSize(1000,1000);
        getContentPane().setBackground(Color.BLUE);       
        setResizable(false); 
        
        btn1 = new JButton ("Entrar"); 
        btn1.setBounds(450, 300, 150, 100);
        btn1.addActionListener(this);
        
        getContentPane().add(btn1);
    }
    
    public static void main (String [] args) {
        
        JFrame form = new Forms ();
        
        form.setVisible (true); 
        
        
        
        
        
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource()== btn1) {
         JOptionPane.showMessageDialog(null, "Botao Ativado!");
     }   
            
    }         

}
