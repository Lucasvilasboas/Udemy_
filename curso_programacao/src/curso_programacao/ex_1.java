package curso_programacao;
import java.util.*;
public class ex_1 {

public static void main(String[] args) {
	int n1;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um n�mero inteiro");
	n1 = entrada.nextInt();
	
	if (n1 >=0 ) {
		System.out.println("N�O NEGATIVO");
	} else {
		System.out.println("NEGATIVO");
	}
}
}
