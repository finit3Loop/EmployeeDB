
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

		return retString;
	}

}
