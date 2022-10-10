import java.util.Locale;
import java.util.Scanner;

public class AreasGeometria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		
		System.out.println("Informe os valores A, B e C respectivamente para calcular as áreas de um triângulo, um círculo, um trapézio, um quadrado e um retângulo:");
		System.out.println("A área do triângulo tem A como base e C como altura.");
		System.out.println("A área do círculo tem C como raio. Pi = 3.14159.");
		System.out.println("A área do trapézio tem A e B como bases e C como altura.");
		System.out.println("A área do quadrado tem B como os lados.");
		System.out.println("A área do retângulo tem A e B como os lados.");
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangulo = (A * C) / 2;
		areaCirculo = pi * Math.pow(C, 2);
		areaTrapezio = ((A + B) * C) / 2;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A * B;
		
		System.out.printf("Área do triângulo = %.3f%n", areaTriangulo);
		System.out.printf("Área do círculo = %.3f%n", areaCirculo);
		System.out.printf("Área do trapézio = %.3f%n", areaTrapezio);
		System.out.printf("Área do quadrado = %.3f%n", areaQuadrado);
		System.out.printf("Área do retângulo = %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
