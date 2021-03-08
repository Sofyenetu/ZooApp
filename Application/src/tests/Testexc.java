package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testexc {

	@Test(NullPointerException.class)
	public void methodCallToNullObject() {
	    Object o = null;
	    o.toString();
	}

}
