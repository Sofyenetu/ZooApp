package AppliZoo;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import org.json.*;

public class Exemple {

	public static void main(String[] args) {
		
		Zoo z1 = new Zoo("peaugres", "47, rue de la banque" );
		

		
		Felin f1 = new Felin("leopardus", 3, "masculin");
		Felin f2 = new Felin("felis", 7, "masculin");
		Felin f3 = new Felin("pardofelius", 2, "feminin");
		
		Cage c1 = new Cage(9987634);
		
		c1.ajouterFelin(f1);
		c1.ajouterFelin(f2);
		c1.ajouterFelin(f3);
		
		z1.ajouterCages(c1);
		
		z1.afficherinfo();
		c1.afficherInfo();
				
		new TexteHtml();
		
		try {
			FileOutputStream fos = new FileOutputStream(new File("C:\\Developpement\\Todo\\db_zoo"));
			XMLEncoder encoder = new XMLEncoder(fos);
			encoder.writeObject(z1);
			encoder.close();
			fos.close();
		}
		catch(IOException ex) {
			System.out.println("Erreur lors de l'ecriture du fichier");	
			ex.printStackTrace();
		}
		
		try
		{
		creating a constructor of file class and parsing an XML file
		File file = new File("C:\\Developpement\\Todo\\db_zoo - Copie.xml");
		an instance of factory that gives a document builder
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		an instance of builder to parse the specified xml file
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);
		doc.getDocumentElement().normalize();
		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
		NodeList nodeList = doc.getElementsByTagName("animal");
		 nodeList is not iterable, so we are using for loop
		for (int itr = 0; itr < nodeList.getLength(); itr++)
		{
		Node node = nodeList.item(itr);
		System.out.println("\nNode Name :" + node.getNodeName());
		if (node.getNodeType() == Node.ELEMENT_NODE)
		{
		Element eElement = (Element) node;
		System.out.println("animal id: "+ eElement.getElementsByTagName("id").item(0).getTextContent());
		System.out.println("Type Animal : "+ eElement.getElementsByTagName("typeanimal").item(0).getTextContent());
		System.out.println("emplacement: "+ eElement.getElementsByTagName("emplacement").item(0).getTextContent());
		System.out.println("Age: "+ eElement.getElementsByTagName("age").item(0).getTextContent());
		System.out.println("vaccin�: "+ eElement.getElementsByTagName("vaccin�").item(0).getTextContent());
		System.out.println("eleveur: "+ eElement.getElementsByTagName("eleveur").item(0).getTextContent());
		}
		}
		}
		catch (Exception e)
		{
		System.out.println("Erreur lors de la recuperation des donnees et affichage dans la console");
		e.printStackTrace();
		}
		}

}
