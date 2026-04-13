import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String> Lista = new ArrayList<>();
		
		System.out.println("Quantos itens serão adicionados?");
		int itens = sc.nextInt();
		
		System.out.println("Digite os itens: ");
		for (int i=1;i<=itens;i++) {
			Lista.add(sc.nextLine());
		}
		System.out.println("Lista de compras: ");	
		for(String Total:Lista) {		
			System.out.println(Total);
		}
	}

}
