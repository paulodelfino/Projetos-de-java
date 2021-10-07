
package xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XML {

   //ParserConfiguration - retirar e manter apenas Exception para erros em geral. 
    public static void main(String[] args) throws Exception {
       
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse("agenda.xml");
        
        Element elem = doc.getDocumentElement();
        NodeList pai = elem.getElementsByTagName("ficha");
        
        for (int i = 0; i < pai.getLength(); i++) {
          // comeca do 0 por isso <
          Element atributofilho = (Element)pai.item(i);
          String id = atributofilho.getAttribute("id");
          // getAttribute pega o atributo do no filho 
          
          NodeList nome = atributofilho.getElementsByTagName("nome");
          Element tagNome = (Element) nome.item(0);
          String vnome = tagNome.getTextContent();
          
          NodeList end = atributofilho.getElementsByTagName("endereco");
          Element tagEnd = (Element) end.item(0);
          String vend = tagEnd.getTextContent();
          
          NodeList telefone = atributofilho.getElementsByTagName("telefone");
          Element tagTel = (Element) telefone.item(0);
          String vtel = tagTel.getTextContent();
          
          
            System.out.println(""+id+" "+vnome+" "+vend+" "+vtel);
            
            
            
            
            
        }
       
        
        
        
    }
    
}
