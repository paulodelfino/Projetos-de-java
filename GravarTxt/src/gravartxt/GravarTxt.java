/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravartxt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AuthProvider;
import java.util.Properties;

/**
 *
 * @author JAVA
 */
public class GravarTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Properties texto = new Properties();
            texto.setProperty("Nome", "Senai");
            texto.setProperty("Curso", "Java");
            texto.setProperty("Periodo", "Noite");
            OutputStream os = new FileOutputStream("aluno"+1+".txt");
            texto.store(os,"");
            os.close();
            
            Properties ler = new Properties();
            InputStream is = new FileInputStream("aluno1.txt");
            ler.load(is);
            System.out.println(ler.getProperty("Nome"));
            System.out.println(ler.getProperty("Curso"));
            System.out.println(ler.getProperty("Periodo"));
            
        } catch (Exception e) {
            
        }
        
    }
    
}
