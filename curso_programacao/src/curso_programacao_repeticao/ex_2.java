package curso_programacao_repeticao;
import java.util.*;
public class ex_2 {
public static void main(String[] agrs) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Digite o valor de X");
		int x = sc.nextInt();
	for (int i = 1; i<=x; i++) {
		if (i %2 != 0) {
			System.out.println(i);
		}
	}
}
}
