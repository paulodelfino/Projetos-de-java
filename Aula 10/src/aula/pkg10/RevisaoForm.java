
package aula.pkg10;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class RevisaoForm  extends JFrame implements ActionListener {

   JButton btn1, btn2; 
   JTextField txt1, txt2;
    
    public RevisaoForm() {
       //largura x altura
       
       //PARTE REFERENTE AO CANVAS, TAMBEM CONHECIDO COMO FORM OU RETANGULO **
        getContentPane(). setLayout(null);
        setSize(800,500);
        setResizable(false);
        setTitle("Meu primeio Formulario no braço!");
        getContentPane().setBackground(Color.RED);
        
        // PARTE REFERENTE AOS OBJETOS DE FOMULÁRIOS ( instancia de objetos) 
        
        btn1 = new JButton ("Entre");
        btn2 = new JButton ("Fechar");
        
        txt1 = new JTextField (30);
        txt2 = new JTextField (30);
                     
        // PARTE REFERENTE AO POSICIONAMENTO DOS OBJETOS DE FORMULÁRIOS
        
        btn1.setBounds(200, 200, 150, 50);
        btn1.addActionListener(this);
        btn2.setBounds(200, 400, 150, 50);
        btn2.addActionListener(this);
        
        txt1.setBounds(400, 200, 150, 50);
        txt2.setBounds(400, 400, 150, 50);
        
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        getContentPane().add(txt1);
        getContentPane().add(txt2);
                
      }    
    

    public static void main(String[] args) {
        
        RevisaoForm rf = new RevisaoForm ();
        rf.setVisible(true);
       
        
    }
    
       
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btn1){
            
            txt2.setText(txt1.getText());
            
            txt1.setText("");
            
            
        }
        
        if (e.getSource() == btn2){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    
}
