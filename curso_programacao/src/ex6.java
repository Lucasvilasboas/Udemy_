import java.util.*;
public class ex6 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double A, B,C ;
	double pi = (double) 3.14159;
	Locale.setDefault(Locale.US);
	System.out.println("Digite o valor de A");
	A = entrada.nextDouble();
	System.out.println("Digite o valor de B");
	B = entrada.nextDouble();
	System.out.println("Digite o valor de C");
	C = entrada.nextDouble();
	double a_triangulo, a_circulo, a_trapezio, a_quadrado, a_retangulo;
	a_triangulo = ((A * C) /2 );
	a_circulo = (pi *(C * C));
	a_trapezio = (((A +B)*C) /2);
	a_quadrado = (B * B);
	a_retangulo = (A * B);
	System.out.printf("TRIANGULO: %.3f \n" , a_triangulo);
	System.out.printf("CIRCULO: %.3f \n" , a_circulo);
	System.out.printf("TRAPEZIO: %.3f \n", a_trapezio);
	System.out.printf("QUADRADO: %.3f \n", a_quadrado);
	System.out.printf("RETANGULO: %.3f \n", a_retangulo);


}
}
