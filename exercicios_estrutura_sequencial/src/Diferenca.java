import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, formula;
		
		System.out.printf("Digite quatro números e em seguida aparecerá a diferença%ndo produto entre A e B pelo produto de C e D:%n");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		formula = a * b - c * d;

		System.out.print("O resultado do cálculo foi: " + formula);

		sc.close();
	}

}
