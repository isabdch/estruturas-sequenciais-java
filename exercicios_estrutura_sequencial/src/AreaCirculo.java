import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		double pi = 3.14159;
		
		System.out.print("Informe o valor do raio de um círculo: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A área do círculo de acordo com o raio %.2f é igual a %.4f", raio, area);
		
		sc.close();
	}

}
