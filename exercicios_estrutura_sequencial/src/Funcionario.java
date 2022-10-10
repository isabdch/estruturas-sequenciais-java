import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		double horas, valor, salario;
		
		System.out.println("Informe o número do funcionário, seu número de horas trabalhadas e o valor de sua hora respectivamente:");
		numero = sc.nextInt();
		horas = sc.nextDouble();
		valor = sc.nextDouble();
		
		salario = valor * horas;
		
		System.out.printf("O salário do funcionário de número %d, de acordo com as horas registradas, é de R$%.2f.", numero, salario);
		
		sc.close();
	}

}
