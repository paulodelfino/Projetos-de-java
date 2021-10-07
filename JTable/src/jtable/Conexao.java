
package jtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Conexao {
    
    public ArrayList bichos = new ArrayList();
    
    public Conexao(){
        try{
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_bichos");
           Statement stm = con.createStatement();
           //Resultset = somente para consulta, o resto é int
           ResultSet result = stm.executeQuery("select * from tb_mundoanimal");
            while (result.next()) {
                bichos.add(result.getString("nome").toLowerCase());
            }
       }catch(Exception e){
           e.printStackTrace();
       }
       
    }
    public ArrayList pesquisa (String pedaco){
        
        ArrayList retorno = new ArrayList();
        
        for (int i = 0; i < bichos.size(); i++) {
            String b = (String) bichos.get(i);
            
            if (b.indexOf(pedaco)>=0) {
                retorno.add(b);
            }
        }
        return retorno;
    }
}
