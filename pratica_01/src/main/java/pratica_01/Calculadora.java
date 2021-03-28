package pratica_01;

public class Calculadora {

	public static void main(String[] args) {}

//Este metodo ira realizar o calculo do arranjo.
		public int arranjo (int n, int p) {
			int fatN = 1;
	        for (int i = 1; i <= n; i = i + 1) {
	            fatN = fatN * i;
	        }
			int fatP = 1;
	        for (int i = 1; i <= p; i = i + 1) {
	            fatP = fatP * i;
	        }
	        int fatNP = 1;
	        for (int i = 1; i <= (n-p); i = i + 1) {
	        	fatNP = fatNP * i;
	        }
	        
	        int arranjo = fatN/fatNP;
	        System.out.println(fatN);
	        System.out.println(fatNP);
	        return arranjo;
	      
		}
        
}