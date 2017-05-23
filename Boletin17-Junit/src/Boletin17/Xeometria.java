package Boletin17;

/**
 * 
 * @author marcosbarreiro
 *
 */
public class Xeometria {
	
	/**Recibe un lado del cuadrado y devuelve el perimetro
	 * 
	 * @param lado
	 * @return perimetro
	 */
	public int perimetroCadrado(int lado) {
		//lado nulo o negativo devuelve error
		if (lado<=0) {
			return -1;
		}	
		return (lado*lado);		
	}

	/**Recibe un lado del cuadrado y devuelve su area
	 * 
	 * @param lado
	 * @return area
	 */
	public int areaCadrado(int lado) {
		// lado nulo o negativo devuelve error
		if (lado<=0) {
			return -1;
		}		
		return (lado*4);
	}

	/**Recibe dos catetos de un triangulo para devolver la hipotenusa
	 * 
	 * @param catetoA
	 * @param catetoB
	 * @return Hipotenusa
	 */
	public double teoremaPitagoras(int catetoA, int catetoB){
		//catetoA o catetoB nulos o negativos devuelve error
		if (catetoA<=0 || catetoB <=0) {
			return -1;
		}
		return Math.sqrt(catetoA*catetoA) + (catetoB*catetoB);
	}

	
	/**Recibe la hipotenusa y uno de los catetos y devuelve el
	 * cateto restante
	 * 
	 * @param hipotenusa
	 * @param catetoA
	 * @return catetoB
	 */
	public double teoremaPitagoras (double hipotenusa, double catetoA) {
		//catetoA o hipotenusa nulos o negativos devuelve error
		if (catetoA<=0 || hipotenusa <=0) {
			return -1;
		}
		if (catetoA > hipotenusa) {
			return -2;
		}
		return Math.sqrt(catetoA*catetoA) + (hipotenusa*hipotenusa);
	}

}
