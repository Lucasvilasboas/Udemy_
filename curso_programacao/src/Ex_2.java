import java.util.*;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
public class Ex_2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		float horas, valor, salario;
		
		System.out.println("Digite o seu número");
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
