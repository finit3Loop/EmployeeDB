
import java.util.*;

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
		do {
			System.out.println("What would you like to do? :");
			Scanner scan = new Scanner(System.in);
			try {
				choice = scan.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Not a number");
				choice = 2;
			} catch (NoSuchElementException e) {
				System.out.println("Not a number");
				choice = 2;
			}
			//scan.close();

			switch (choice) {
			// add Employee
			case 1:
				/*
				 * Employee cal = new Employee(); Company.add(cal);
				 */
				break;

			// Search for employee
			case 2:
				Scanner scan2 = new Scanner(System.in);

				String searchString = new String();

				System.out.println("Enter Employee to display: ");
				int n = scan.nextInt();
				for (int i = 1; i <= Company.size(); i++) {
					Employee current = new Employee();

					if (current.getName() == searchString) {
						System.out.println("Your employee info: " + current.toString());
					} else {
						System.out.println("Not this one...");
					}

				}
				scan2.close();
				break;
			default:
				break;
			}

			scan.close();
		} while (choice != 0);

		// System.out.println(Company.toString());

	}

}
