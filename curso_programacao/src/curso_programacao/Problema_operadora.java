package curso_programacao;

import java.util.*;

public class Problema_operadora {
	public static void main(String[] args) {
		double minutos, valor_pagar, valor_minutos = 2.0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de minutos consumidos");
		minutos = entrada.nextDouble();
		double dif_minutos;
		if (minutos > 100) {
			dif_minutos = minutos - 100;
			valor_pagar = (50.0 + (dif_minutos * valor_minutos));
		}

		else {
			valor_pagar = 50.0;
		}
		System.out.printf("Valor a pagar: R$ %.2f", valor_pagar);
	}

}
