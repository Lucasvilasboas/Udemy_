package curso_programacao_repeticao;

import java.util.*;

public class ex1 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i<=x  ; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
sc.close();
	}
}
