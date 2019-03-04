
import java.util.*;
import java.io.*;

import javax.swing.JFileChooser;

public class mainClass {

	public static void main(String[] args) {

		/*
		 * System.out.println("pick the vector file"); JFileChooser c = new
		 * JFileChooser(); c.showOpenDialog(c);
		 */

		ArrayList<Employee> Company = new ArrayList<Employee>();

		Employee cal = new Employee();

		for (int i = 0; i <= 100; i++) {
			Company.add(Employee.rand());
		}
		for (int i = 0; i < Company.size(); i++) {
			System.out.println(Company.get(i));
		}
		Company.add(cal);

		int choice;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("What would you like to do? :");

			try {
				choice = scan.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Not a number");
				choice = 2;
			} catch (NoSuchElementException e) {
				System.out.println("Not a number");
				choice = 2;
			}

			switch (choice) {

			// add Employee
			case 1:

				Employee newEmp = new Employee();
				Company.add(newEmp);

				break;

			// Search for employee
			case 2:

				String searchString = new String();

				System.out.println("Enter Employee to display: ");
				searchString = scan.next();
				for (int i = 0; i < Company.size(); i++) {
					Employee current = new Employee();
					current = Company.get(i);
					if (current.getName() == searchString) {
						System.out.println("Your employee info: " + current.toString());
					}

				}

				break;
			default:
				break;
			}

		} while (choice != 0);

		// System.out.println(Company.toString());
		scan.close();
	}

}
