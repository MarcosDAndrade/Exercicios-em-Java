package ExercicioVetor;

import java.util.Scanner;

public class soma_vetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma, media;
		System.out.println("Quantos números irá digitar?");
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for (int i =0;i<n;i++) {
			System.out.println("Digite o número: ");
			num[i] = sc.nextInt();
		}
		
		soma = 0;
		for (int i=0;i<n;i++) {
			soma = soma + num[i];
		}
		
		media = soma/n;
		
		
		System.out.println("Valores: ");
		
		for(int i =0;i<n;i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
		sc.close();
		
	}

}
