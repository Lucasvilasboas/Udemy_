package curso_programacao_repeticao;

import java.util.*;

public class Ex4_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite  a quantidade de numeros");
		int qnt = sc.nextInt();
		sc.nextLine();
		double resultado = 0;
		for (int i = 0; i < qnt; i++) {
			System.out.println("Digite N1");
			double n1 = sc.nextDouble();
			System.out.println("Digite N2");
			double n2 = sc.nextDouble();

			if (n2 == 0) {
				System.out.println("Divisão impossível");
			} else {
				resultado = n1 / n2;
				System.out.println(resultado);
			}
			
		}
	}
}
