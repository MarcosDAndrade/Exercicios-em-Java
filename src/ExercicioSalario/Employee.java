package src.ExercicioSalario;

import java.util.Scanner;

public class Employee {
	private String name;
	private double grossSalary;
	public double tax;
	
	Employee(){
		
	}
	Employee(String name, double grossSalary, double tax){
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public double Netsalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
        double increasedSalary = Netsalary() + (grossSalary * percentage / 100);
        System.out.println("Updated data: " + name + " , " + "$ " + increasedSalary);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	

}
