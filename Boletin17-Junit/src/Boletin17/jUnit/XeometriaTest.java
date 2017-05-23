package Boletin17.jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Boletin17.Xeometria;

public class XeometriaTest {

	@Test
	public void testPerimetroCadrado() {
		Xeometria xeo = new Xeometria();
		assertEquals(xeo.perimetroCadrado(10),100);
		assertEquals(xeo.perimetroCadrado(-1),-1);
		assertEquals(xeo.perimetroCadrado(0),-1);
	}

	@Test
	public void testAreaCadrado() {
		Xeometria xeo = new Xeometria();
		assertEquals(xeo.areaCadrado(2),8);
		assertEquals(xeo.areaCadrado(0),-1);
		assertEquals(xeo.areaCadrado(-1),-1);
	}

	@Test
	public void testTeoremaPitagorasIntInt() {
		Xeometria xeo = new Xeometria();
		assertEquals(xeo.teoremaPitagoras(-1, -1),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(-1, 1),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(1, -1),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(0, -1),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(-1, 0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(1, 0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(0, 1),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(0, 0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(-1, -1),-1, 0.001);
		
		
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		Xeometria xeo = new Xeometria();
		assertEquals(xeo.teoremaPitagoras(-1.0, -1.0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(-1.0, 1.0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(1.0, -1.0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(0, -1.0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(-1.0, 0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(1.0, 0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(0, 1.0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(0, 0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(-1.0, -1.0),-1, 0.001);
		assertEquals(xeo.teoremaPitagoras(1.0, 2.0),2.236, 0.001);
		assertEquals(xeo.teoremaPitagoras(2.0, 1.0),-2, 0.001);
	}

}
