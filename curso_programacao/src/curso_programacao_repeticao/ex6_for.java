package curso_programacao_repeticao;
import java.util.*;
public class ex6_for {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Digite o valor de N");
	int n = sc.nextInt();

	for (int i=1; i<=n; i++) {
		if (n % i == 0) {
			System.out.println(i);
		}
	}
}
}
