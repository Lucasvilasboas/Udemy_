package curso_programacao;

import java.util.*;

public class media_final {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double licao, atv_pratica, prova, media_final;
		System.out.println("Digite a media dos testes de lição");
		licao = entrada.nextDouble();
		
		System.out.println("Digite a nota da atividade prática");
		atv_pratica = entrada.nextDouble();
		
		System.out.println("Digite a nota da prova");
		prova = entrada.nextDouble();

		licao = (licao * 1);
		atv_pratica = (atv_pratica * 2);
		prova = (prova * 3);

		media_final = ((licao + atv_pratica + prova) / 6);
		System.out.printf("Media Final: %.2f" , media_final);

	}
}
