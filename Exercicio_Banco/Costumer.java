package Exercicio_Banco;

import java.util.Scanner;

public class Costumer {
	String name;
	int number;
	double balance;

	public Costumer() {

	}

	public Costumer(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public void Status() {
		System.out.println("Number " + number + ", " + "Holder: " + name + ", " + "Balance: $" + balance);
	}

	public void initial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is there na initial deposit (y/n)?");
		char opc = sc.next().charAt(0);
		if (opc == 'y') {
			System.out.println("Enter Initial Value: ");
			double value = sc.nextDouble();
			setBalance(value);
			Status();
		} else {
			Status();
		}
		sc.close();
	}
	
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deposit value data: ");
		double value = sc.nextDouble();
		balance += value;
		System.out.println("Updated number data: ");
		Status();
		sc.close();
	}

	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw value data: ");
		double value = sc.nextDouble();
		if(value > 0) {balance -= value + 5.0;}
		System.out.println("Updated number data: ");
		Status();
		sc.close();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getnumber() {
		return number;
	}

	public void setnumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
