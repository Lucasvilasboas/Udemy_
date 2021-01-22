package curso_programacao;

import java.util.Scanner;

public class whilee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de x");
		int x = sc.nextInt();
		int soma = 0;
		while (x != 0) {
			soma += + x;
			x = sc.nextInt();
		}
		System.out.println("Sona: " +soma);
		sc.close();
	}
}
