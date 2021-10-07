
package projetobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class ProjetoBD {

    
    public static void main(String[] args) {
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_crud");
            Statement stm = con.createStatement();
            String s = "Joao";
            ResultSet result = stm.executeQuery("select * from tb_cliente where cli_nome='"+s+"'");
            
            
            while (result.next()){
                System.out.println(result.getString("cli_codigo"));   
                System.out.println(result.getString("cli_nome"));   
                System.out.println(result.getString("cli_endereco"));   
                System.out.println(result.getString("cli_curso"));   
                System.out.println("----------------------------------------------------");
                                         
            }
            
           
            
            //int r = stm.executeUpdate("insert into tb_cliente(cli_codigo,cli_nome,cli_endereco,cli_curso) values ('3','Joao','Santos','Senai')");      // insere
            int r1 = stm.executeUpdate("delete from tb_cliente where cli_codigo = '3'"); //ESSA OPCAO E PRA DELETAR
            int r2 = stm.executeUpdate("UPDATE tb_cliente SET cli_nome = 'superman'where cli_codigo = '6' ");// SETAR E PARA ATUALIZAAR/ALTERAR
            
        } catch (Exception e) {
            e.printStackTrace(); // pra verificar se tem erro 
          
            
        }
            
            
     
        
   
        
        
        
    }
    
}
