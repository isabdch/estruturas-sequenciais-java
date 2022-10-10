import java.util.Locale;
import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo_1, codigo_2, quantidade_1, quantidade_2, quantidade_total;
		double valor_1, valor_2, valor_total;

		System.out.println("Informe o código, a quantidade e o valor unitário de um primeiro tipo de peça:");
		codigo_1 = sc.nextInt();
		quantidade_1 = sc.nextInt();
		valor_1 = sc.nextDouble();
		
		System.out.println("Agora, informe o código, a quantidade e o valor unitário de um segundo tipo de peça:");
		codigo_2 = sc.nextInt();
		quantidade_2 = sc.nextInt();
		valor_2 = sc.nextDouble();
		
		valor_total = (quantidade_1 * valor_1) + (quantidade_2 * valor_2);
		quantidade_total = quantidade_1 + quantidade_2;
		
		System.out.printf("O valor total a se pagar das %d peças é de R$%.2f.", quantidade_total, valor_total);
		
		sc.close();
	}

}
