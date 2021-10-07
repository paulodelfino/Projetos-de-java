
package desenho;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class Desenhar extends JFrame {
    
    public Desenhar() { // metodo construtor
        getContentPane().setLayout(null); //CANVAS 
        setSize(1000,1000);
           
}
    public static void main (String [] args){ // metodo executor
        JFrame f = new Desenhar (); // criar painel
        f.setVisible(true);
                
    }
    
    public void paint (Graphics g) { // n~~ão precisa chamada, forma automatica
        // draw faz retangulo so o contorno
        // fill ele faz o retangulo preenchido em uma cor 
        
           //g.drawRect(200, 200, 50, 50); 
           //g.setColor(Color.BLUE); // cores das figuras
           //g.fillRect(300, 200, 50, 50);
           //g.drawLine(100, 100, 400, 100);
          // g.setColor(Color.DARK_GRAY);
           g.drawOval(400, 400, 400, 400);
           g.setColor(Color.DARK_GRAY);
           g.drawOval(450, 500, 100, 100);
           g.drawOval(480, 550, 50, 50);
           g.drawOval(650, 500, 100, 100);
           g.drawOval(680, 550, 50, 50);
           g.drawOval(570, 600, 50, 50);
           g.drawOval(560, 700, 80, 80);
           g.drawLine(800, 400, 400, 400);
           g.fillRect(500, 200, 200, 200);
    }
            
    
    
    
}
