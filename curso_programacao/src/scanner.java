//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.*;

public class scanner {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n1, n2, n3, n4;
		System.out.println("Digite o primeiro numero");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero");
		n2 = entrada.nextInt();
		System.out.println("Digite o terceiro numero");
		n3 = entrada.nextInt();
		System.out.println("Digite o quarto numero");
		n4 = entrada.nextInt();
		int resultado;
		resultado = (n1 * n2) - (n3 * n4);
		System.out.println("Diferença é: " +resultado);
		
	}
}
