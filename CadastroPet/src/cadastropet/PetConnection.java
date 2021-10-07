/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastropet;
    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.derby.client.am.SqlException;

    
public class PetConnection {
    
    Connection con;
    Statement stm;
    ResultSet result;

    public PetConnection() {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con =  DriverManager.getConnection("jdbc:derby://localhost:1527/db_clientes");
            stm = con.createStatement();
            ResultSet result = stm.executeQuery("Select * from tb_clientes ");
            while (result.next()) {                
                System.out.println(result.getString("nomecliente"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
        public EntidadePet pegaDados(ResultSet rs){
            EntidadePet ep = new EntidadePet();
            try {
                ep.setCodcliente(rs.getInt("codcliente"));
                ep.setNomecliente(rs.getString("nomecliente"));
                ep.setTelcliente(rs.getString("telcliente"));
                ep.setNomepet(rs.getString("petcliente"));
                ep.setNomepetcliente(rs.getString("nomepetcliente"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ep;
        }
    
        public List<EntidadePet> juntaDados() throws SQLException{
            List<EntidadePet> returnlista = new LinkedList<EntidadePet>();
            result = stm.executeQuery("select * form tb_clientes");
            while (result.next()) {                
                returnlista.add(pegaDados(result));
            }
            result.close();
            return returnlista;
        }
}
