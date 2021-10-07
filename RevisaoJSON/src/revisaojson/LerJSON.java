
package revisaojson;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class LerJSON {
   
    public static void main(String[] args) {
       
        JSONObject obj; // DECLARADO
        JSONParser jp = new JSONParser ();
        GloriaJSON gj = new GloriaJSON ();
        try {
            
            obj = (JSONObject) jp.parse(new FileReader ("DadosJSON.json"));
            gj.setNome((String)obj.get("nome"));
            gj.setEndereco((String)obj.get("endereco"));
            gj.setTelefone((String)obj.get("telefone"));
            
            System.out.println("Dados recuperados da JSON :"+gj.toString());
            
            
        }
        catch (Exception e){
            
        }        
        
        
        
        
        
        
    

   
        
    }
}
