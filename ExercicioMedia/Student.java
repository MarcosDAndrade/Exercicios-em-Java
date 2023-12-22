package ExercicioMedia;

public class Student {
	private String name;
	private double  firsttime;
	private double secondtime;
	private double thirdtime;
	
	public Student() {
		
	}
	public Student(String name, double firsttime, double secondtime, double thirdtime) {
		this.name = name;
		this.firsttime = firsttime;
		this.secondtime = secondtime;
		this.thirdtime = thirdtime;
	}
	
	public void showResults() {
		double total = firsttime + secondtime + thirdtime;
		double media = 60.0;
		if (total >= media) {
			System.out.println("FINAL GRADE: " + total + "\n PASS");			
		} else {
			System.out.println("FINAL GRADE: " + total + "\n FAILED");
			double missing = media-total;
			System.out.println("MISSING: " + missing + " POINTS");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFirsttime() {
		return firsttime;
	}
	public void setFirsttime(double firsttime) {
		this.firsttime = firsttime;
	}
	public double getSecondtime() {
		return secondtime;
	}
	public void setSecondtime(double secondtime) {
		this.secondtime = secondtime;
	}
	public double getThirdtime() {
		return thirdtime;
	}
	public void setThirdtime(double thirdtime) {
		this.thirdtime = thirdtime;
	}
	
	
	
	
 

}
