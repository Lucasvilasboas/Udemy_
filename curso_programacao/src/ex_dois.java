
///A = π·r²
import java.util.*;

public class ex_dois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		double a, raio;
		double pi = (double) 3.14159;
		System.out.println("Digite o valor do raio");
		raio = entrada.nextDouble();
		a = (pi * (raio * raio));
		System.out.printf("Valor da área: %.4f ", a);
	}
}
