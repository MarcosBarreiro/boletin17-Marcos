package Boletin17.jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Boletin17.DNI;

public class DNITest extends DNI {
	
	@Test
	public void testeValidoString() {
		DNI dni = new DNI();
		
		assertEquals(true, dni.eValido("00000000T"));
		assertEquals(false, dni.eValido("43567587k"));
		assertEquals(false, dni.eValido("43567587K"));
		assertEquals(false, dni.eValido("00000010X"));
		assertEquals(true, dni.eValido("00000100P"));
		assertEquals(false, dni.eValido("00000000t"));
		assertEquals(false, dni.eValido("00000001r"));
		assertEquals(false, dni.eValido("0000000X"));
		
	}

	@Test
	public void testEValidoArrayListOfInteger() {
	
		
	}

	@Test
	public void testCalculaLetraString() {
		DNI dni = new DNI();
		
		assertEquals((int) 'T', dni.calculaLetra("00000000"));
		assertEquals((int) 'R', dni.calculaLetra("00000001"));
		assertEquals((int) 'X', dni.calculaLetra("00000010"));
		assertEquals((int) 'P', dni.calculaLetra("00000100"));

	}

	@Test
	public void testCalculaLetraArrayListOfInteger() {
	
	}

}
