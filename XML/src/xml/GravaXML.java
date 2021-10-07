
package xml;

import java.io.FileWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;


public class GravaXML {
    
    public static void main(String[] args) throws Exception {
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // clone da classe documentBuilderFactory e deu o nome de dbf (fabrica do documento)
        
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse("agenda2.xml");
        Element elem = doc.getDocumentElement();
        
        Element filho = doc.createElement("ficha");
        filho.setAttribute("id", "3");
        elem.appendChild(filho);
        
        Element tagNome = doc.createElement("nome");
        Text  nomeTXT = doc.createTextNode("JOAQUIM");
        tagNome.appendChild(nomeTXT);
        
        filho.appendChild(tagNome);
        
        Element tagEnd = doc.createElement("endereco");
        Text  endTXT = doc.createTextNode("Santos");
        tagEnd.appendChild(endTXT);
        
        filho.appendChild(tagEnd);
        
         Element tagTel = doc.createElement("telefone");
        Text  telTXT = doc.createTextNode("5555555");
        tagEnd.appendChild(telTXT);
        
        filho.appendChild(tagTel);
        
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer trans = tf.newTransformer();
        
        FileWriter fw = new FileWriter ("agenda2.xml");
        StreamResult sr = new StreamResult (fw);
        DOMSource recurso = new DOMSource(doc);
        trans.transform(recurso, sr);
        
        
        
       
        
        
        
    }
    
}
