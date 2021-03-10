package AppliZoo;

import java.util.LinkedList;

public class Cage {

	private int numero;
	private LinkedList<Felin> felins = new LinkedList<Felin>();
	
	public Cage() {
		
	}
	
	public Cage (int n) {
		this.numero= n;
		
		}
	public LinkedList<Felin> getFelins() {
		return felins;
	}
	public void setFelins(LinkedList<Felin> felins) {
		this.felins = felins;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void ajouterFelin(Felin f) {
		this.getFelins().add(f);
	}
	
	public String toString() {
		String str = "Listing des felins de la cage n° " + this.getNumero();
		 for(Felin  f: this.getFelins()) {
			str = str + f.afficherinfos();
		}
		return str;
	}
	public void afficherInfo() {
		System.out.println(this.toString());
		
		
	}
}

