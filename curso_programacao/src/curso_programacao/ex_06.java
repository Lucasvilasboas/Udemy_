package curso_programacao;
import java.util.*;
public class ex_06 {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	double n1;
	System.out.println("Digite o valor de entrada");
	n1 = entrada.nextDouble();
	
	if (n1 >= 0 && n1 <= 25) {
		System.out.println("Intervalo [0,25]");
	}
	else if (n1 > 25 && n1 <=50)
		System.out.println("Intervalo [25,50]");
	else if (n1 > 50 && n1 <= 75)
		System.out.println("Intervalo [50,75]");
	else if (n1 >75 && n1 <=100)
		System.out.println("Intervalo [75,100]");
	else {
		System.out.println("Fora de intervalo");
	}
}	
}
