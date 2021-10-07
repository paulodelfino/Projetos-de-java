
package petshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class PetShop {

   
    public static void main(String[] args) {
     
        
        // processo de conexao de base de dados
         try{
        Class.forName(("org.apache.derby.jdbc.ClientDriver")); // String de conexao entre java e derby -- pega o drive de conex~~ão com seu arquivo (java com base de dados)
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/teste2"); // localizacao da base (em que base se encontra)
         Statement stmt; // declaraçao
         ResultSet result; // pega a tabela toda
         stmt = con.createStatement();// criou uma declaracao para acessar os dados
         result = stmt.executeQuery("Select * from tb_cliente");
             System.out.println("olá");
         while(result.next()){
             // processo de repeticao (loop)
             
             System.out.println(result.getString("cl_nome"));
             System.out.println(result.getString("cl_endereco"));
             System.out.println(result.getString("cl_telefone"));
         }
         }
         catch (Exception e){
          e.printStackTrace();
         
         }
         
         }
    
}
