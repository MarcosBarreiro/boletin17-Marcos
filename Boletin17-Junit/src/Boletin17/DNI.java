package Boletin17;

import java.util.ArrayList;

public class DNI {

	
	public final static char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public boolean eValido(String dni) {
		if (dni.length() != 9)
			return false;

		dni = dni.toUpperCase();

		int num = 0, c = 0;
		for (int i = 0; i < 8; i++) {
			c = Character.getNumericValue(dni.charAt(i));
			if (c > 9 || c == -1) break;
			num += c*Math.pow(10, 7-i);
		}
		if (c > 9 || c == -1) return false;
		
		char validChar = LETRA_DNI[num % 23]; 

		if (dni.charAt(8) == validChar) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean eValido(ArrayList<Integer> dni) {
		if (dni.size() != 9)
			return false;

		int num = 0;
		for (int i = 0; i < 8; i++) {
			num += dni.get(i)*Math.pow(10, 7-i);
		}

		char validChar = LETRA_DNI[num % 23]; 

		if (dni.get(8) == validChar || dni.get(8) == Character.toLowerCase(validChar)) {
			return true;
		} else {
			return false;
		}
	}

	public int calculaLetra(String numero_dni) {
		if (numero_dni.length() != 8)
			return 0;

		int num = 0, c = 0;
		for (int i = 0; i < 8; i++) {
			c = Character.getNumericValue(numero_dni.charAt(i));
			if (c > 9 || c == -1) break;
			num += c*Math.pow(10, 7-i);
		}
		if (c > 9 || c == -1) return 0;
		
		return LETRA_DNI[num % 23]; 
	}

	public int calculaLetra(ArrayList<Integer> numero_dni) {
		if (numero_dni.size() != 8)
			return 0;

		int num = 0;
		for (int i = 0; i < 8; i++) {
			num += numero_dni.get(i)*Math.pow(10, 7-i);
		}
		return LETRA_DNI[num % 23];
	}
}