package curso_programacao_repeticao;

import java.util.*;

public class ex3_for {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros");
		int n = sc.nextInt();
		sc.nextLine();
		double media_ponde = 0;
		double n1, n2, n3;
		for (int i = 0; i < n; i++) {
			System.out.println("Digite n1");
			n1 = sc.nextDouble();
			System.out.println("Digite n2");
			n2 = sc.nextDouble();
			System.out.println("Digite n3");
			n3 = sc.nextDouble();

			media_ponde = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10;
			System.out.printf("Média: %.1f", media_ponde);
		}

	}
}
