package programa;

import util.conta;
import java.util.*;

public class programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		conta conta = new conta();

		System.out.println("Enter account number: ");
		conta.setNumero_conta(sc.nextInt());
		System.out.println("Enter account holder: ");
		conta.setNome(sc.next());
		sc.nextLine();
		System.out.println("Is there na initial deposit (y/n) ?");

		char resp = sc.next().charAt(0);
		if (resp != 'n') {
			System.out.println("Enter initial deposit value: ");
			conta.setSaldo(sc.nextDouble());
			System.out.println("Account data: ");
			System.out.printf("Account: %d, Holder: %s, Balancee: $%.2f \n", conta.getNumero_conta(), conta.getNome(),
					conta.getSaldo());
		} else {
			System.out.println("Account data: ");
			System.out.printf("Account: %d, Holder: %s, Balancee: $%.2f \n", conta.getNumero_conta(), conta.getNome(),
					conta.getSaldo());
		}

		System.out.println();
		System.out.println("Enter a deposit value: ");
		conta.Setdeposito(sc.nextDouble());

		System.out.printf("Account: %d, Holder: %s, Balancee: $%.2f \n", conta.getNumero_conta(), conta.getNome(),
				conta.getSaldo());
		System.out.println("Enter a withdraw value: ");
		conta.Setsaque(sc.nextDouble());

		System.out.printf("Account: %d, Holder: %s, Balancee: $%.2f \n", conta.getNumero_conta(), conta.getNome(),
				conta.getSaldo());

		sc.close();
	}
}
