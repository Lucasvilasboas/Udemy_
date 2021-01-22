package curso_programacao;
import java.util.*;
public class Ex_8 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite o valor da sua renda");
	double renda = entrada.nextDouble();
	double imposto = 0;
	
	if (renda >= 0.00 && renda <= 2000) {
			System.out.println("Isento");
	} else if (renda >2000 && renda < 3000) {
		imposto = ((renda - 2000) * 0.08);
	}
	else { System.out.println("Renda inválida, digite novamente");
		}
	System.out.println(imposto);
	} 
	
}


