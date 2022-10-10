import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.println("Digite dois números para saber sua soma em seguida:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.print(n1 + " + " + n2 + " = " + soma);
		
		sc.close();
	}

}
