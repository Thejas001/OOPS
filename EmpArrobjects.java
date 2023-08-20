import java.util.Arrays;
import java.util.Scanner;
class Employee{
int eNo,eSalary,String,eName;
Public Employee(){
}
public Empeloyee(int no,int sal,String name){
eNo=No;
eSalary=sal;
eName=name;
}public void showData(){
System.out.println("empID_=_"+eNo+"__"+"_Name_="+eName+"__"+"salary_=_"+eSalary);
System.out.println();
}
}
public class EmpArrobjects
{
	public static void main(String [] args){
		System.out.println("Enter _number_of_employees:_");
		Scanner sc=new Scanner(system.in);
		int n=sc.nextInt();
		System.out.println("enter_employee_details_one_by_one");
		Employee employee[]=new Employee[n];
		Scanner sc_emp=new Scanner(System.in);
		int eid,esal;
		String enam;
		for(int i=0;i<n;i++)
		{
			System.out.println("enter_"+i+"_employee_details");
			System.out.println("enter_employee_id_(integer):_");
eid=sc_emp.nextInt();
System.out.println("enter_employee_name-(String):_");
enam=new String(nam);
System.out.println("enter_emp_salary(integer):_");
Employee emp = new Employee (eid,esal,enam);
employee[i]=emp;
		}
		System.out.println("employee_number_to_search:_");
		int semp=sc.nextInt();
		boolean found=false;
		for(Employee e:employee){
			if(semp==e.eNo){
				found=true;
				System.out.println("employee_found");
				e.showData();
				break;
			}
		}
		if(!found){
			System.out.println("employee_no+_found");
		}
	}
}