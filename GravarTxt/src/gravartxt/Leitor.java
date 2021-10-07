/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravartxt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;


public class Leitor {
    
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("aluno1.txt"));
            String linha = bf.readLine();
            while (linha != null) {     
                if (linha.equals("Periodo=Noite")) {
                }
                System.err.println(linha);
                linha = bf.readLine();
            }
        } catch (Exception e) {
        }
    }
       
    
}
