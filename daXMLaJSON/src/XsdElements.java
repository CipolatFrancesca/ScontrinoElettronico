import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class XsdElements {
 public static void main(String args[]) {
  try {
   FileWriter w = new FileWriter("C:\\Users\\inf.cipolatf2709\\Desktop\\xml\\2\\src\\scriviJson.js");
   BufferedWriter b=new BufferedWriter (w);
   String line="{";
   b.write(line);
   b.write("\n");
   // parse the document
   DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
   DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
   Document doc = docBuilder.parse(new File("C:\\Users\\inf.cipolatf2709\\Desktop\\xml\\2\\src\\CorrispettiviTypes_v1.0  (tracciato V 7.0 marzo2020).xsd"));
   NodeList list = doc.getElementsByTagName("xs:element");

   //loop to print data
   for (int i = 0; i < list.getLength(); i++) {
    Element first = (Element) list.item(i);
    if (first.hasAttributes()) {
     String nome = first.getAttribute("name");
     System.out.println(nome);
     String tipo = first.getAttribute("type");
     System.out.println(tipo);
     //prendo nome : tipo ; per tutti
     if (i + 1 != list.getLength()) {
      System.out.println(nome + " : " + tipo + " ; ");
      line = "\"" + nome + "\" : \"" + tipo + "\"; ";
      System.out.println("line= " + line);
      b.write(line);
      b.write("\n");
     } else {
      line = "\"" + nome + "\" : \"" + tipo + "\"";
      System.out.println("line= " + line);
      b.write(line);
      b.write("\n");
     }
    }
   }
   line="}";
   b.write(line);
   b.write("\n");
   b.close();
  } catch (ParserConfigurationException e) {
   e.printStackTrace();
  } catch (IOException ed) {
   ed.printStackTrace();
  } catch (org.xml.sax.SAXException e) {
   e.printStackTrace();
  }
 }
}
