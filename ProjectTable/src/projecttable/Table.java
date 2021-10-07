
package projecttable;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Table extends JFrame {
    public Table (){
        
    setTitle("Ensino Tabelaa 1");
    setSize(300,200);
    setBackground(Color.GRAY);
    
    JPanel topPainel = new JPanel ();
    topPainel.setLayout(new BorderLayout());
    
    getContentPane().add(topPainel);
    
    Object [] colunas = new Object []{"Coluna1","Coluna2","Coluna3"};
    
    Object [][] valores = new Object [3][3];
    for ( int i=0; i<3; i++){
        
        
        valores [i][0]= "Linha"+i+"Coluna"+0;
        valores [i][1]= "Linha"+i+"Coluna"+1;
        valores [i][2]= "Linha"+i+"Coluna"+2;
        
        
    }
    
    JTable tb = new JTable (valores,colunas);
        
    JScrollPane sc = new JScrollPane (tb);
    topPainel.add(sc,BorderLayout.CENTER);
    
    }
    public static void main(String[] args) {
        
        Table tt = new Table();
        tt.setVisible(true);
    }
    
   
}
