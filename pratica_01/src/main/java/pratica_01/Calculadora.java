package pratica_01;

public class Calculadora {

	public static void main(String[] args) {
		arranjo (7,3);
	}

//Este metodo ira realizar o calculo do arranjo.
		public static int fatorialN(int n) {
			int resultadoN = 1;
			while( n > 0) {
				resultadoN = resultadoN * n;
				n--;
			}
			return resultadoN;
			}
		public static int fatorialNP(int n ,int p) {
			int resultadoNP = 1;
			int np = (n-p);
			while( np > 0) {
				resultadoNP = resultadoNP * np;
				np--;
			}
			return resultadoNP;
			}
		
		public static int arranjo (int n, int p ) {
			return fatorialN(n)/fatorialNP(n,p);
	      
		}
        
}