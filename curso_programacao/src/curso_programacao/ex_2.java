package curso_programacao;
import java.util.*;
public class ex_2 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int n1;
	System.out.println("Digite um numero inteiro");
	n1 = entrada.nextInt();
	if (n1 %2 == 0) {
		System.out.println("Par");
	} else {
		System.out.println("Impar");
	}
}
}
