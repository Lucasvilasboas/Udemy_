package curso_programacao;
import java.util.*;
public class Ex_5 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int quantidade, codigo;
	double  total = 0;
	System.out.println("Digite o codigo do produto ");
	codigo = entrada.nextInt();
	System.out.println("Digite a quantidade");
	quantidade = entrada.nextInt();
	switch (codigo) {
	case 1:
		total = (4.0 * quantidade);
		break;
	case 2: 
		total = (4.50 * quantidade);
		break;
	case 3:
		total = (5.0 * quantidade);
	break;
	case 4:
		total = (2.0 * quantidade);
		break;
	case 5:
		total = (1.5 * quantidade);
		break;
	default:
		System.out.println("Digite um código válido");
		
	}
	System.out.printf("Total: R$ %.2f " ,total);
	entrada.close();
}
}
