package curso_programacao_repeticao;

import java.util.*;

public class ex_for {
	public static void main(String[] args) {
		System.out.println("Digite a quantidade de numeros");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o valor de X");
			int x = sc.nextInt();
			soma = soma + x;
		}
		sc.close();
		System.out.println("Soma:" + soma);
	}
}
