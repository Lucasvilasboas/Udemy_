import java.util.*;

public class ex_5 {
public static void main(String[] args) {
	int num_pecas1, codigo1, num_pecas2, codigo2; 
	float valor_peca1, valor_peca2, valor_pagar2, valor_pagar1, valor_final;
	Scanner entrada = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	System.out.println("Digite o codigo da peça");
	codigo1 = entrada.nextInt();
	System.out.println("Digite o numero de peças");
	num_pecas1 = entrada.nextInt();
	System.out.println("Digite o valor da peça");
	valor_peca1 = entrada.nextFloat();
	valor_pagar1 = (valor_peca1 * num_pecas1);
	
	System.out.println("Digite o codigo da peça 2");
	codigo2 = entrada.nextInt();
	System.out.println("Digite o numero de peças");
	num_pecas2 = entrada.nextInt();
	System.out.println("Digite o valor da peça 2");
	valor_peca2 = entrada.nextFloat();
	valor_pagar2 = (valor_peca2 * num_pecas2);
	valor_final = (valor_pagar1 + valor_pagar2);
	System.out.printf("VALOR A PAGAR R$ %.2f", valor_final);
	
}
}
