package test;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

public class MoneyTest {
	
	private Money m12CHF;
	
	@Before
    public void setUp() {
        m12CHF = new Money(12, "CHF");
    }
	
	@Test
	public void testSimpleAdd() {
		Money m14CHF = new Money(14, "CHF");
		Money expected = new Money(26, "CHF");
		Money result = m12CHF.add(m14CHF); // exécution de la méthode testée
		assertTrue(expected.equals(result)); // comparaison
	}
	
	@Test
	public void testEquals() {
	    Money anotherM12CHF = new Money(12, "CHF");
	    assertTrue(m12CHF.equals(anotherM12CHF));
	}
}
