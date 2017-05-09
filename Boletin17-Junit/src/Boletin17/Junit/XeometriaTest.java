package Boletin17.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class XeometriaTest {

	@Test
	public void testPerímetroCadrado() {
		Xeometria xeo = new Xeometria();
		assertEquals(xeo.perímetroCadrado(-123),-1);
	}

	@Test
	public void testAreaCadrado() {
		Xeometria xeo = new Xeometria();
		assertEquals(xeo.areaCadrado(2),8);
	}

	@Test
	public void testTeoremaPitagorasIntInt() {
		Xeometria xeo = new Xeometria();
		assertEquals(2.83,xeo.teoremaPitagoras(2,2),0.01);
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		fail("Not yet implemented");
	}

}
