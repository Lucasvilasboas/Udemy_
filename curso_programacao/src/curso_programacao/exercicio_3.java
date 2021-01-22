package curso_programacao;
import java.util.*;
public class exercicio_3 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int A, B;
	System.out.println("Digite o valor de A");
	A = entrada.nextInt();
	System.out.println("Digite o valor de B");
	B = entrada.nextInt();
		
	if (A % B == 0 || B % A == 0) {
		System.out.println("São multiplos");
	} else {
		System.out.println("Não são multiplos");
	}
	entrada.close();
}
}
