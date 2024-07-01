import java.util.Scanner;
public class overload
{
void area (double r)
{
double Ar = 3.14*r*r;
System.out.println ("Area of Circle = "+Ar);
}
void area (float a)
{
System.out.println ("Area of square = "+a*a) ;
}
void area (int len, int br)
{
int Ar = len*br;
System.out.println("Area of Rectangle = "+ Ar);
}
void area (int l, int b, int h)
{
int Ar = l*b*h;
System.out.println("Area of Cuboid = "+ Ar);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Overload obj1 = new Overload() ;
System.out.println ("Enter the Radius");
int r = sc.nextInt();
obj1.area(r);
System.out.println ("Enter the side");
int a = sc.nextInt();
obj1.area(a);
System.out.println("Enter the Length & Breath ");
int len = sc.nextInt();
int br = sc.nextInt();
obj1.area(len,br);
System.out.println("Enter the Length, Breath & Height ");
int l = sc.nextInt();
int b = sc.nextInt();
int h = sc.nextInt();
obj1.area (l, b, h);
}
}

