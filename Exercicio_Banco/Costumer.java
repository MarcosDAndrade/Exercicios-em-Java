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

	public void initial(double value) {
			setBalance(value);
			Status();
	}
	
	public void deposit(double value) {
		balance += value;
		System.out.println("Updated number data: ");
		Status();
	}

	public void withdraw(double value) {
		if(value > 0) {balance -= value + 5.0;}
		System.out.println("Updated number data: ");
		Status();
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
