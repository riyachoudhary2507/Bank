import java.util.Scanner;

public class Employees
{
	public static void main(String[] args)
	{
		int empid, empsalary;
		String empname;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter employee id: ");
		empid = scan.nextInt();
		System.out.print("Enter employee name: ");
		empname = scan.nextLine();
		System.out.println("Employee id: "+empid +"Employee name: "+empname);
		System.out.print("Enter employee salary: ");
		empsalary = scan.nextInt();
		
		
	}

}
