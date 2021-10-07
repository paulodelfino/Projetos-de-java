/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serializa {
 

    public static void main(String[] args) throws Exception{

        String nome = (p2.getproperty("NOME"));
        String tel = TEL.getText();
        String end = END.getText();
        
        
        Properties p2  = new Properties(); 
        p2.setProperty("NOME",nome); 
        p2.setProperty("TEL", tel); 
        p2.setProperty("END",end);
        
        OutputStream os = null;
        try {
            os = new FileOutputStream("BT1.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializa.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            p2.store(os, "BT1.txt");
        } catch (IOException ex) {
            Logger.getLogger(Serializa.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            os.close();
        } catch (IOException ex) {
            Logger.getLogger(Serializa.class.getName()).log(Level.SEVERE, null, ex);
        
        
        
        
    }
     Public String ler () throws Excection (
             
    Properties p = new Properties();
        InputStream is = new FileInputStream("LER.txt");
        p.load(is);
        System.out.println(p.getProperty("nomeAplicacao"));
        System.out.println(p.getProperty("versao"));
        System.out.println(p.getProperty("diretorio"));
        is.close();
    
}
