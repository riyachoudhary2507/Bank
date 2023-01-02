import java.util.Scanner;

public class Employees
{
	static int empid;
	static String empname;
	
	public static void displayEmployeeInfo()
	{
		System.out.println("Employee id: "+empid +"Employee name: "+empname);
	}
	
	public static void main(String[] args)
	{
<<<<<<< HEAD
=======
		int empid, empsalary;
		String empname;
>>>>>>> user2
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter employee id: ");
		empid = scan.nextInt();
		System.out.print("Enter employee name: ");
		empname = scan.nextLine();
<<<<<<< HEAD
		displayEmployeeInfo();
=======
		System.out.println("Employee id: "+empid +"Employee name: "+empname);
		System.out.print("Enter employee salary: ");
		empsalary = scan.nextInt();
		
>>>>>>> user2
		
	}

}
