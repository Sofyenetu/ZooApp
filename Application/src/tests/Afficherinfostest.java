package tests;




import org.junit.jupiter.api.Test;

import AppliZoo.Cage;
import AppliZoo.Zoo;

class Afficherinfostest {

	@Test
	final void testAfficherinfo() throws IllegalArgumentException { 
		Zoo z1 = new Zoo("peaugres", "47, rue de la banque");
		
		
		Cage c1= new Cage();
		if (c1.getNumero() == 0) {
			throw new IllegalArgumentException("Numero non defini : affectation impossible au zoo");
		} else {
			z1.ajouterCages(c1);
		}
		
	}

	public static void main(String[] args) {
		
	}

}
