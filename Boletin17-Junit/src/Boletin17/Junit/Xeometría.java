package Boletin17.Junit;

import java.util.Scanner;

public class Xeometría {
	
	public void perimetroCadrado(String[] ar) {
		int lado;
		System.out.print("Introduce lado del cuadrado: ");
		Scanner teclado = new Scanner (System.in);
		lado = teclado.nextInt();
		System.out.print("Área: " + (lado*lado));
		teclado.close();
	}
	
	public void areaCadrado (String[] ar) {
		int lado;
		System.out.print("Introduce lado del cuadrado: ");
		Scanner teclado = new Scanner (System.in);
		lado = teclado.nextInt();
		System.out.print("Perímetro: " + (lado*4));
		teclado.close();
	}
	
	public void teoremaPitagoras(String[] ar) {
		int catetoA,catetoB;
		System.out.print("Introduce lado A:");
		Scanner teclado = new Scanner (System.in);
		catetoA = teclado.nextInt();
		System.out.print("Introduce lado B:");
		catetoB = teclado.nextInt();
		System.out.print("Hipotenusa: " + ((catetoA*catetoA) + (catetoB*catetoB)));
		teclado.close();
	}
	
	public void teoremaPitagoras2 (String[] ar) {
		double catetoA,hipotenusa;
		System.out.print("Introduce lado A:");
		Scanner teclado = new Scanner (System.in);
		catetoA = teclado.nextInt();
		System.out.print("Introduce hipotenusa:");
		hipotenusa = teclado.nextInt();
		System.out.print("LadoB: " + Math.sqrt((catetoA*catetoA) + (hipotenusa*hipotenusa)));
		teclado.close();
	}
	
	
	
	

}
