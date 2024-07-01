import java.util.Scanner;
interface Student
{
void displayScore();
}
interface Sports
{
void displaySpScore();
}
class Result implements Student, Sports
{
String name;
private int acScore;
private int spScore;
public Result(String name, int acScore, int spScore)
{
this.name = name;
this.acScore = acScore;
this.spScore = spScore;
}
@Override
public void displayScore()
{
System.out.println("Name: " + name);
System.out.println("Academic score is: " + acScore);
}
@Override
public void displaySpScore()
{
System.out.println("Sports score is: " + spScore);
}
}
public class StudentSports
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter student's name: ");
String name = sc.nextLine();
System.out.print ("Enter academic score: ");
int acScore = sc.nextInt();
System.out.print ("Enter sports score: ");
int spScore = sc.nextInt();
Result r = new Result (name, acScore, spScore);
r.displayScore ();
r.displaySpScore ();
}
}
