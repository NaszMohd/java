import java.util.*;
import java.text.DecimalFormat;

class Employee
{

int id;
String name=" ";
float sal;
}

class Sample2
{
private static final DecimalFormat df = new DecimalFormat("0.00");
public static void main(String[] args){
    
		Scanner sc = new Scanner(System.in); 
		System.out.println("How many Empolyee's data do you want to Enter ?");
		int k = Integer.parseInt(sc.nextLine());
		//int k;
		Employee[] emp = new Employee[k];	
		Scanner n = new Scanner(System.in);
		for(int i=0;i<k;i++)
		
		{
			emp[i] = new Employee();
		    //extracted(emp, i);
		System.out.println("Enter " + (i+1) + " Employee Data" );
		System.out.println("Enter Employee Id :");
		emp[i].id = sc.nextInt();
		System.out.println("Enter Employee Name :");
		emp[i].name = n.nextLine();
		System.out.println("Enter Employee Salary :");
		emp[i].sal = sc.nextFloat();

		}

  for (int i=0;i<k;i++)
  {
		System.out.println("Employee name and salary:" + emp[i].id + " " + emp[i].name + " RM" + df.format(emp[i].sal));
  }
	
}

}