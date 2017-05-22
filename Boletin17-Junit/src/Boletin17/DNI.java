package Boletin17;

import java.util.ArrayList;

public class DNI {

	/*
	 *Esto es una cadena de caracteres con una letra en cada posicion 
	 */
	public final static char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
 
	/**
	 * 
	 * @param dni es un string q es un dni
	 * @return booleano, true si el dni corresponde con la letra o false en caso contrario
	 */
	public boolean eValido(String dni) {
		int num = Integer.parseInt(dni.substring(0, 7)); 
		
		char validChar = LETRA_DNI[num % 23]; 

		if (dni.charAt(8) == validChar) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * 
	 * @param dni es un array
	 * @return booleano, true si el dni corresponde con la letra o false en caso contrario
	 */
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

	/**
	 * 
	 * @param numero_dni es el dni en un string
	 * @return calcula la letra que corresponde para el grupo de los 8 numeros del dni
	 */
	public int calculaLetra(String numero_dni) {

		int num = Integer.parseInt(numero_dni); 
		
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