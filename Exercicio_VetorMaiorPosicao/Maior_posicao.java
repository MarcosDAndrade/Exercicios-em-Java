package Exercicio_VetorMaiorPosicao;

import java.util.Scanner;

public class Maior_posicao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, maiornumero=0,posicaomaior=0;
		System.out.print("Quantos números irá digitar?");
		n = sc.nextInt();
		int[] num = new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("Digite um número: ");
			num[i] = sc.nextInt();
			if (num[i] > maiornumero) {
				maiornumero = num[i];
				posicaomaior = i;
			}
		}
		
		System.out.println("Maior número: " + maiornumero);
		System.out.println("Posição do maior valor: ");
		for(int i=0;i<1;i++) {
			System.out.println(posicaomaior+1);
		}
		
		sc.close();
	}
}
