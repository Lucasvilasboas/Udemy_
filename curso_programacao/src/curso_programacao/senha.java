package curso_programacao;
import java.util.*;
public class senha {
public static void main (String []agrs) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite sua senha");
	int senha = sc.nextInt();
	
	
	while (senha != 2002) {
		System.out.println("Senha Invalida");
		System.out.println("Digite sua senha");
		senha = sc.nextInt();
	}
	
	System.out.println("Acesso permitido");
	sc.close();
}
}
