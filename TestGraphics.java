import java.util.Scanner;
import figures.*;
public class TestGraphics
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter length and breadth of the rectangle:");
double length = sc.nextDouble();
double breadth = sc.nextDouble();
Rectangle rectObj = new Rectangle(length, breadth);
System.out.println("Area of Rectangle: " + rectObj.calcArea());
System.out.println("Enter base and height of the triangle:");
double base = sc.nextDouble();
double height = sc.nextDouble();
Triangle triObj = new Triangle(base, height);
System.out.println("Area of Triangle: " + triObj.calcArea());
System.out.println("Enter side length of the square:");
double side= sc.nextDouble();
Square sqObj = new Square(side);
System.out.println("Area of Square: " + sqObj.calcArea());
System.out.println("Enter radius of the circle:");
double radius = sc.nextDouble();
Circle cirObj = new Circle(radius);
System.out.println("Area of Circle: " + cirObj.calcArea());
}
}
