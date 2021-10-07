
package revisaojson;

import java.io.FileWriter;
import org.json.simple.JSONObject;


public class RevisaoJSON {

    
    public static void main(String[] args) {
        
        FileWriter fw = null;
        JSONObject obj = new JSONObject (); // instancia
        
        obj.put ("nome", "Billi");
        obj.put ("endereco", "Senai Santos");
        obj.put ("telefone","8888888");
        
        try{
          fw = new FileWriter ("DadosJSON.json");  
          fw.write(obj.toJSONString());
          fw.close ();
          

        }
        catch (Exception e) {
            
            
        }
        
        System.out.println(obj.toJSONString());
        
        
        
        
        
        
        
        
        
        
      
    }
    
}
