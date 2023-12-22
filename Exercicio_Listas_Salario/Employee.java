package Exercicio_Listas_Salario;

public class Employee {
	private String name;
	private Integer id;
	private Double salary;
	
	Employee(){
		
	}
	Employee(Integer id, String name, Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return id + "," + name + ", " + String.format("%.2f", salary);
		
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage/100;
		System.out.println(salary);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
