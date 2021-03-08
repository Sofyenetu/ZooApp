package AppliZoo;



public class Animal {
	
	private String nom;
	private int age;
	private String sexe;
	
	
	public Animal(String n, int a, String s) {
		this.nom=n;
		this.age=a;
		this.sexe=s;
	}
	
	public String getNom() {
		return nom;
	}
	public int getAge() {
		return age;
	}
	public String getSexe() {
		return sexe;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String afficherinfos() {
		String str = "L'animal s'apelle " + this.getNom() + " il a " + this.getAge() +  " c'est un " + this.getSexe();
		return str;
	}
		
	
	
	
	
	public void mange() {
	
		
	}
	

}
