import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorPorMetroQuadrado, area, preco;
		
		System.out.println("Informe a largura, comprimento (com uma casa decimal) e valor por metro quadrado (com duas casa decimais) do terreno, respectivamente:");
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		valorPorMetroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * valorPorMetroQuadrado;
		
		System.out.printf("A área do terreno é de %.2fm² e seu preço é de R$%.2f.", area, preco);
		
		sc.close();
	}

}
