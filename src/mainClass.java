
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class mainClass {

	public static void main(String[] args) {

		System.out.println("pick the vector file");
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(c);

		ArrayList<Employee> Company = new ArrayList<Employee>();
		int choice;
		do {
			System.out.println("What would you like to do? :");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			switch (choice) {
			// add Employee
			case 1:
				Employee cal = new Employee();
				Company.add(cal);
				break;
			default:
				break;
			}

			//scan.close();
		} while (choice != 0);
		Employee cal = new Employee();

		Company.add(cal);
		System.out.println(Company.toString());
	}

}
