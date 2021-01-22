package curso_programacao_repeticao;

import java.util.*;

public class ex2_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade");
		int quantidade = sc.nextInt();
		int x = 0;
		int in =0, out =0;
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Digite o valor de X");
			x = sc.nextInt();
			if (x >=10 && x<=20) {
				in += +1;
			} else {
				out += +1;
			}
		} 
		System.out.println(in +" in "+ "\n" + out +" out ");
		
}
}