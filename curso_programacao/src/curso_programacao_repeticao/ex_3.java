package curso_programacao_repeticao;

import java.util.*;

public class ex_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, disel = 0;
		int tipo_comb;
		System.out.println("Digite o tipo de combustível abastecido");
		tipo_comb = sc.nextInt();

		while (tipo_comb !=4) {
			System.out.println("Digite o tipo de combustível abastecido");
			tipo_comb = sc.nextInt();
		if (tipo_comb == 1) {
			alcool = alcool + 1;
		}
		else if (tipo_comb == 2)
		{
			gasolina = gasolina +1;
		}
		else if (tipo_comb == 3) {
			disel = disel +1;
		}
		}
		
	
		System.out.println("Muito Obrigado \n" + "Alcool:  " + alcool + "\n" + "Gasolina: " +gasolina + "\n" + "Disel: " + disel);
sc.close();
	}

}
