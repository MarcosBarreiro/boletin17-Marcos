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
		assertEquals(xeo.teoremaPitagoras(-1, -1), Math.sqrt(-1), 0.001);
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		Xeometria xeo = new Xeometria();
		assertEquals(xeo.teoremaPitagoras(-1, -1), Math.sqrt(-1),0.001);
	}

}
