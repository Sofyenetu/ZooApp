package AppliZoo;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TexteHtml extends JFrame {
    JEditorPane grandeZone;

    public TexteHtml() {
	JScrollPane texteAsc;
	StringBuffer texte;

	texte = saisirTexte("C:\\Developpement\\Todo\\db_zoo - Copie.xml");

	grandeZone = new JEditorPane("text/html", new String(texte));
	grandeZone.setPreferredSize(new Dimension(300, 120));
	grandeZone.setEditable(false);
	texteAsc = new JScrollPane(grandeZone);
	add(texteAsc, BorderLayout.CENTER);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setLocation(300, 300);
	setVisible(true);
  }
   
    public StringBuffer saisirTexte(String nomFichier) {
	File fichier = new File(nomFichier);
	StringBuffer texte = new StringBuffer();
	
	try {
	    Scanner lecteur = new Scanner(fichier);
	    
	    while (lecteur.hasNext()) 
	    	texte.append(lecteur.nextLine());
	}
	catch (FileNotFoundException exc) {
	    System.out.println("Fichier inexistant");
	}
	return texte;
    }
}


class EssaiTexteHtml {
 public static void main(String[] arg) {
      new TexteHtml();
    }
}