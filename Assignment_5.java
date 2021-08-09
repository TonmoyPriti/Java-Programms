import java.util.*;

class Members{
	protected String Name,Address,PhNumber;
	protected int age,Salary;
	public void printsalary(){
		System.out.println("  >> Salary : "+Salary);
	}
	public void display(){
		System.out.println("  >> Name : "+Name);
		System.out.println("  >> Address : "+Address);
		System.out.println("  >> Age : "+age);
		System.out.println("  >> Phone Number : "+PhNumber);
		printsalary();
	}
}

class Employee extends Members{
	String specialization,department;
	public Employee(String Name,String Address,int age,String PhNumber,int Salary,String Sp,String Dept){
		this.Name=Name;
		this.Address=Address;
		this.age=age;
		this.PhNumber=PhNumber;
		this.Salary=Salary;
		specialization=Sp;
		department=Dept;
	}
}

class Manager extends Members{
	String specialization,department;
	public Manager(String Name,String Address,int age,String PhNumber,int Salary,String Sp,String Dept){
		this.Name=Name;
		this.Address=Address;
		this.age=age;
		this.PhNumber=PhNumber;
		this.Salary=Salary;
		specialization=Sp;
		department=Dept;
	}
}

public class Assignment_5{
	public static void main(String args[]){
		String name,Add,Ph,dept,sp;
		int age,sal;
		Scanner S=new Scanner(System.in);
		Scanner S2=new Scanner(System.in);
		System.out.println("* Enter the manager details : ");
		System.out.println("  >> Name : ");
		name=S.nextLine();
		System.out.println("  >> Address : ");
		Add=S.nextLine();
		System.out.println("  >> Age : ");
		age=S2.nextInt();
		System.out.println("  >> Phone Number : ");
		Ph=S.nextLine();
		System.out.println("  >> Salary : ");
		sal=S2.nextInt();
		System.out.println("  >> Specialization : ");
		sp=S.nextLine();
		System.out.println("  >> Department : ");
		dept=S.nextLine();
		Manager M=new Manager(name,Add,age,Ph,sal,sp,dept);
		System.out.println("* Enter the employee details : ");
		System.out.println("  >> Name : ");
		name=S.nextLine();
		System.out.println("  >> Address : ");
		Add=S.nextLine();
		System.out.println("  >> Age : ");
		age=S2.nextInt();
		System.out.println("  >> Phone Number : ");
		Ph=S.nextLine();
		System.out.println("  >> Salary : ");
		sal=S2.nextInt();
		System.out.println("  >> Specialization : ");
		sp=S.nextLine();
		System.out.println("  >> Department : ");
		dept=S.nextLine();
		Employee E=new Employee(name,Add,age,Ph,sal,sp,dept);
		System.out.println("* Manager details :");
		M.display();
		System.out.println("\n* Employee details :");
		E.display();
	}
}
