package AppliZoo;

public class Felin extends Animal  {
	
	public Felin() {
		super();
	}
	
	public Felin(String n, int a, String s) {
		super(n, a, s);
	}
	
	private Cage habite;
	
	
	public Cage gethabite() {
		return habite;
	}

	public void sethabite(Cage habite) {
		this.habite = habite;
	}
	
	
public void mange() {
	
	System.out.println(this.getNom()+" mange de la viande");
	
		
	}

}

