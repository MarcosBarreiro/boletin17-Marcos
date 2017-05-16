package Boletin17;


public class Xeometria {
	
	public int perímetroCadrado(int lado) {
		if (lado<0) {
			return -1;
		}	
		return (lado*lado);		
	}

	
	
	public int areaCadrado(int lado) {
		if (lado<0) {
			return -1;
		}		
		return (lado*4);
	}

	
	public double teoremaPitagoras(int catetoA, int catetoB){
		if (catetoA<=0 || catetoB <=0) {
			return -1;
		}
		return Math.sqrt(catetoA*catetoA) + (catetoB*catetoB);
	}

	
	
	public double teoremaPitagoras (double hipotenusa, double catetoA) {
		if (catetoA<=0 || hipotenusa <=0) {
			return -1;
		}
		return Math.sqrt(catetoA*catetoA) + (hipotenusa*hipotenusa);
	}

}
