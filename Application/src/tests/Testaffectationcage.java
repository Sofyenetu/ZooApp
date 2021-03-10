package tests;




import org.junit.jupiter.api.Test;

import AppliZoo.Cage;
import AppliZoo.Zoo;

class Testaffectationcage {

	@Test
	final void test() throws IllegalArgumentException {
		   
			Zoo z1 = new Zoo("peaugres", "47, rue de la banque");
			
			
			Cage c1= new Cage(556466464);
			System.out.println(c1.getNumero());
			if (c1.getNumero() == 0) {
				throw new IllegalArgumentException("Numero non defini : affectation impossible au zoo");
			} else {
				z1.ajouterCages(c1);
			}
	}

}

