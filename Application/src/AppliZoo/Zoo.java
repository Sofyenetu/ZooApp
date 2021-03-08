package AppliZoo;


import java.io.*;  
import java.util.LinkedList;


public class Zoo {
	private String nom;
	private String adresse;
	private LinkedList<Animal> animals = new LinkedList<Animal>();
	private LinkedList<Cage> cages = new LinkedList<Cage>();

	
	public Zoo (String n, String ad) {
		this.nom= n;
		this.adresse= ad;
		
		}
	
	public LinkedList<Cage> getCages() {
		return cages;
	}

	public void setCages(LinkedList<Cage> cages) {
		this.cages = cages;
	}

	public LinkedList<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(LinkedList<Animal> animals) {
		this.animals = animals;
	}

	public void setNom(String nme) {
		this.nom= nme;
	}
	
	public String getNom() {
		return nom;
	}
	
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public void ajouterCages(Cage c) {
		this.getCages().add(c);
	}

	
	public String toString() {
		String str = "Listing des animaux du zoo " + this.getNom();
		str = str + " situer" + this.getAdresse(); 
		for(Animal ani: this.getAnimals()) {
			str = str + ani.afficherinfos();
		}
		return str;
	}
	
	public void afficherinfo() {
		System.out.println(this.toString());
	}
}


