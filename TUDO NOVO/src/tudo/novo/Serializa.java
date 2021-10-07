/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudo.novo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Serializa {
 

    public static void GRAVA (String n, String t, String e) throws Exception { // PUXA DA OUTRA PARTE

              
        // para salvar dados no arquivo config.
        
        Properties p2  = new Properties(); //JOGA INFORMAÇOES NO P2
        p2.setProperty("Nome", n);  
        p2.setProperty("Telefone", t); 
        p2.setProperty("Endereço",e);
        
        OutputStream os = new FileOutputStream("Cad.txt");
        p2.store(os, "Arquivo Cad.txt"); //METODO PRA JOGAR NO ARQUIVO
        os.close();//FECHA O ARQUIVO
        
        
    }
    
    public String LER()throws Exception {
        
        
          Properties p = new Properties();
       InputStream is = new FileInputStream("Cad.txt"); // TRAZER DO OUTRO LUGAR (ABRE O ARQUIVO QUE ESTA NA MINHA OASTA)
        p.load(is);
         String nome = (p.getProperty("Nome"));
        String telefone = (p.getProperty("Telefone"));
        String endereço = (p.getProperty("Endereço"));
        is.close();
        
        return nome; 
    
    }
    
    public String SV()throws Exception {
        
        
          Properties p = new Properties();
       InputStream is = new FileInputStream("Cad.txt");
        p.load(is);
         String nome = (p.getProperty("Nome"));
        String telefone = (p.getProperty("Telefone"));
        String endereço = (p.getProperty("Endereço"));
        is.close();
        
        return telefone; 
    
        
    }   
    
    
    public String LV()throws Exception {
        
        
          Properties p = new Properties();
       InputStream is = new FileInputStream("Cad.txt");
        p.load(is);
         String nome = (p.getProperty("Nome"));
        String telefone = (p.getProperty("Telefone"));
        String endereço = (p.getProperty("Endereço"));
        is.close();
        
        return endereço; 
    } 
    
}
