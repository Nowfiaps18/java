class Employee
{
int eno;
String eName;
Employee()
{
 eno=100;
 eName="Adarsh";
}
void show()
{
System.out.println("\n Employee no:-"+eno+"\n Employee Name-"+eName);
}
}
class Constructor1
{
public static void main(String args[])
{
Employee obj1=new Employee();
obj1.show();
}
}


