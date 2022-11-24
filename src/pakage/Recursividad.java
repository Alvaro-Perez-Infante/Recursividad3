package pakage;

public class Recursividad {

	public static void main(String[] args) {

		int n1 = 3;
		int n2 = 5;
		
		
		System.out.println("El resultado de la multiplicación es: " + multiplicacion(n1, n2));
	}
	
	public static int multiplicacion(int n, int n2) {
		int r;
		if (n2 == 1) {
			r = n;
		} else {
			r = n + multiplicacion (n, n2-1);
		}
		return r;
	}
}