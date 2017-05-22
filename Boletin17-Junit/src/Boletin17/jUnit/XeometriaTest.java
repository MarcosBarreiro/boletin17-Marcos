package Boletin17.jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Boletin17.Xeometria;

public class XeometriaTest {

	@Test
	public void testPerimetroCadrado() {
		Xeometria xeo = new Xeometria();
		assertEquals(xeo.perimetroCadrado(-123),-1);
	}

	@Test
	public void testAreaCadrado() {
		Xeometria xeo = new Xeometria();
		assertEquals(xeo.areaCadrado(2),8);
	}

	@Test
	public void testTeoremaPitagorasIntInt() {
		Xeometria xeo = new Xeometria();
		fail("Not yet implemented");
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		fail("Not yet implemented");
	}

}
