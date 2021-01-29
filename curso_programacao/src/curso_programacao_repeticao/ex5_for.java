package curso_programacao_repeticao;
import java.util.*;
public class ex5_for {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o valor de N: ");
	int n = sc.nextInt();
	int resultado =1;
	for (int i =1; i <=n; i++) {
		
			resultado = resultado *i;
		
	}
	System.out.println(resultado);
}
}
