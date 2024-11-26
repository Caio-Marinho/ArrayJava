package ArrayJava;

public class Array {
	public static void main(String[] args) {
		int cont = 1;
		double a[] = {1,8,2.5,1.4,1.1};
		for (double i:a) {
			System.out.print(i + ( cont < a.length ? " -> " : " "));
			cont++;
		}
	}
}
