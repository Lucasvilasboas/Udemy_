package curso_programacao;
import java.util.*;
public class condicional_ternaria {
public static void main (String args[]) {
	
double preco = 35.5;	
double desconto = (preco < 20) ?   preco * 0.1 :   preco * 0.05;
System.out.println("Preço final: " + (preco - desconto));	
System.out.println(desconto);
}
}
