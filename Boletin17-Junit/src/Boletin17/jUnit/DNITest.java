package Boletin17.jUnit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Boletin17.DNI;

public class DNITest extends DNI {
	DNI dni = new DNI();
	
	@Test
	public void testeValidoString() {
		Assert.assertEquals(dni.eValido("78786658P"), true);
		
	}

	@Test
	public void testEValidoArrayListOfInteger() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculaLetraString() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculaLetraArrayListOfInteger() {
		fail("Not yet implemented");
	}

}
