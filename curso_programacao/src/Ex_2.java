import java.util.*;

//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
//decimais.
public class Ex_2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		float horas, valor, salario;
		
		System.out.println("Digite o seu n�mero");
		numero = entrada.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas");
		horas = entrada.nextFloat();
		System.out.println("Digite o valor da sua hora");
		valor = entrada.nextFloat();
		entrada.close();
		salario = (horas * valor);
		System.out.printf("NUMBER = %d \nSALARY = U$ %.2f", numero, salario);
	}
}
