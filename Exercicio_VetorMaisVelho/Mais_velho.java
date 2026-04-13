package Exercicio_VetorMaisVelho;

import java.util.Scanner;

public class Mais_velho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,posicaomaior = 0,maisvelho;
		
		System.out.println("Quantas pessoas você vai digitar?");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int [] idade = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Dados da " +(i+1)+ "a Pessoa");
			
			System.out.print("Nome: ");	
			nome[i] = sc.next();
			sc.nextLine();
			System.out.print("Idade: ");	
			idade[i] = sc.nextInt();
		}
		
		maisvelho = idade[0];
		
		for(int i=0;i<n;i++) {
			if(idade[i]>maisvelho) {
				maisvelho = idade[i];
				posicaomaior = i;
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s%n" , nome[posicaomaior]);
		
		sc.close();
		}
		
	}
