package curso_programacao;
import java.text.DecimalFormat;
import java.util.*;
public class Ex_7 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);

	Scanner entrada = new Scanner(System.in);

	//DecimalFormat formato = new DecimalFormat("#.##");
	double x = 0; 
	double y =0;
	System.out.println("Digite o valor de X");
	x = entrada.nextDouble();
	System.out.println("Digite o valor de Y");
	y = entrada.nextDouble();
	
	if (x == y && x == 0) {
		System.out.println("Origem");
	}
	else if (x > 0 && y > 0) {
		System.out.println("Q1");
	}
	else if (y > 0 && x < 0) {
		System.out.println("Q2");
	}
	else if ( x < 0 && y < 0)
		System.out.println("Q3");
	else if (x > 0 && y < 0)
		System.out.println("Q4");
}
}
