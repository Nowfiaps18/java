import java.util.Scanner;
class Person
{
  {
    String name,gender,addr;
    int age;
    Person (String name,String gender,String aadr,int age);
    {
      this.name = name;
      this.gender=gender;
      this.addr=addr;
      this.age=age;
    }
   }
   class Employee extends Employee
   {
    String sub,dept;
    int Tid;
    Teacher(String name,String gender,String addr,int age,int empid,String compName,String qual,double salary,String sub,String dept,int Tid)
    {
    super(name,gender,addr,age,empid,compName,qual,salary);
    this.sub=sub;
    this.dept=dept;
    this.Tid=Tid;
   }
   void display()
   {
   System.out.println("Name:" +name);
   System.out.println("Gender:" +gender);
   System.out.println("Address:" +addr);
   System.out.println("Age:" +age);
   System.out.println("Employee Id:" +Employee id);
   System.out.println("Company Name:" +company name);
   System.out.println("Qualification:" +qualification);
   System.out.println("Salary:" +salary);
   System.out.println("subject:"+subject);
   System.out.println("Department:"+department);
   System.out.println("Teacher id:"+teacherid);
   }
   }
 public class multilevelTeacher
 {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the number of teachers:");
     int n=sc.nextInt();
     Teacher[] teachers =new Teacher[n];
     System.out.println("enter details for teacher");
     for(int i=0;i<n;i++)
     {
       System.out.print("name:");
       String name=sc.next();
       System.out.print("gender:");
       String gender=sc.next();
       System.out.print("address:");
       String addr=sc.next();
       System.out.print("Age:");
       int age=sc.nextInt();
       System.out.print("Company Name:");
       String CcompName =sc.next();
       System.out.print("Qualification");
       String qual =sc.next();
       System.out.print("Salary:");
       double salary = sc.nextDouble();
       System.out.print("Subject:");
       String sub =sc.next();
       System.out.print("Department:");
       System.out.print("Teacher ID");
       int Tid=sc.nextInt();
       teachers[i]=new Teacher(name,gender,addr,age,empid,compName,qual,salary,sub,dep,Tid);
       }
       System.out.print("\n Details of Teachers:");
       for( Teacher i:teachers)
       {
        i.display();
        System.out.println();
}
}
}
       
