import java.util.Scanner;
public class computerarea
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
double radius=input.nextDouble();
double area=radius*radius*3.14;
System.out.println("Area="+area);
}
}
