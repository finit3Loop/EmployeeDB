
import java.util.*;

public class Employee {

	private String name;
	private int employeeNumber;
	private int salary;
	private int daysOff;
	private int beginingTime, endTime;

	public Employee() {
		Random rand = new Random();

		this.name = "Steve";
		this.employeeNumber = rand.nextInt();
		this.salary = 50000;
		this.daysOff = 0;
		this.beginingTime = 900;
		this.endTime = 1700;
	}

	public String toString() {

		String retString = new String();
		retString = this.name;
		retString += ", " + this.employeeNumber;
		System.out.println();
		return retString;

	}

	public static Employee rand() {
		Random rand = new Random();

		Employee randEmp = new Employee();

		randEmp.name = "randEmp";
		randEmp.employeeNumber = rand.nextInt();
		randEmp.salary = rand.nextInt();
		randEmp.daysOff = rand.nextInt();
		randEmp.beginingTime = rand.nextInt();
		randEmp.endTime = rand.nextInt();

		return randEmp;
	}

}
