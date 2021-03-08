package AppliZoo;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FenetreListeNoms extends JFrame implements ListSelectionListener {
    JList liste = new JList();
    JLabel etiquette = new JLabel("Test");
    

  public FenetreListeNoms() {
    String choix[] = {" Pierre", " Paul", " Jacques", " Lou", " Marie"};
   
    liste = new JList(choix);
    liste.addListSelectionListener(this);

    add(etiquette, BorderLayout.WEST);
    add(liste, BorderLayout.EAST);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public void valueChanged(ListSelectionEvent evt)  { 
      etiquette.setText((String)liste.getSelectedValue());
      
  }
} 

class EssaiFenetreNoms {
	public static void main(String[] args) {
      new FenetreListeNoms();
    }
}
