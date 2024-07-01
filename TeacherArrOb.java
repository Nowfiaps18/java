import java.util.Scanner;
/* Create a class Employee with data members: Empid , Name, Salary, Address & constructors
to initialize the data members*/
class Employee
{
protected int empId;
protected String name;
protected double salary;
protected String address;
public Employee(int empId, String name, double salary, String address)
{
this.empId = empId;
this.name = name;
this.salary = salary;
this.address = address;
}
} /*Create another class Teacher that inherits the properties of class Employee & contains its own data
members department, Subjects taught and constructors to initialize these data members and include
a display function to display all the data members */
class Teacher extends Employee
{ private String dept;
private String sub;
public Teacher(int empId, String name, double salary, String address,
String dept, String sub)
{ super (empId, name, salary, address);
this.dept = dept;
this.sub = sub;
}
public void display()
{
System.out.println("Employee ID: " + empId);
System.out.println("Name: " + name);
System.out.println("Salary: " + salary);
System.out.println("Address: " + address);
System.out.println("Department: " + dept);
System.out.println("Subjects Taught: " + sub);
System.out.println();
}
} //Use array of objects to display details of N teachers
public class TeacherArrOb
{
public static void main(String[] args)
{
Scanner sc = new Scanner (System.in);
System.out.print ("Enter the number of teachers: ");
int N = sc.nextInt();
sc.nextLine(); // Consume newline
Teacher[ ] teachers = new Teacher[N];
System.out.println("Enter details for Teacher ");
for (int i = 0; i < N; i++)
{
System.out.print("Employee ID: ");
int empId = sc.nextInt();
sc.nextLine(); // Consume newline
System.out.print("Name: ");
String name = sc.nextLine();
System.out.print("Salary: ");
double salary = sc.nextDouble();
sc.nextLine(); // Consume newline
System.out.print("Address: ");
String address = sc.nextLine();
System.out.print("Department: ");
String dept = sc.nextLine();
System.out.print("Subjects Taught: ");
String sub = sc.nextLine();
teachers[i] = new Teacher(empId, name, salary, address, dept, sub);
}
System.out.println("\nDetails of all teachers:");
for (Teacher teacher: teachers)
teacher.display();
}
}
