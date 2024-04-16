import java.util.Scanner;
class Publisher
{
  String name;
  public void getPublisherDetails()
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("enter Publisher Name:");
   name=sc.nextLine();
   }
   }
class Book extends Publisher
{
 String title;
 int year;
 public void getBookDetails()
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enetr Book Title:");
   title=sc.nextLine();
   System.out.print("enter Publication year:");
   year=sc.nextInt();
   sc.nextLine();
   }
   public void displayBookDetails()
   {
    System.out.println("\nPublisher:"+name);
    System.out.println("Title:"+tile);
    System.out.println("year of publication:"+year);
    }
    }
    class Literature extends Book
    {
    String gen;
    public void getLiteratureDetails()
    {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Generation:");
     gen=sc.nextLine();
     }
     @Override
     public void displayBookDetails()
     {
       super.displayBookDeatils();
       System.out.println("Generation:"+gen);
     }
     }
class Fiction extends Book
{
  String theme;
  public void getFictionDetails()
  {
  Scanner sc=new Scanner(System.in);
  System.out.print("enetr Theme:");
  theme=sc.nextLine();
  }
@Override
public void displayBookDetails()
{
 super.dispalyBookDetails();
 System.out.println("Theme:"+theme);
 }
public class  BookInheritance
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the no of literature books");
  int numLitBooks=sc.nextInt();
  Literature[]litBooks=new Literature[numLitBooks];
  System.out.println("Enter details for literature books:");
  for(int i=0;i<numLitBooks;i++)
  {
   litBooks[i]=new Literature();
   litBooks[i].getPublisherDetails();
   litBooks[i].getBookDetails();
   litBooks[i].getLiteratureDetails();
   }
   System.out.print("Enter the number of fiction books:");
   int numFicBooks=sc.nextInt();
   Fiction[]ficBooks=new Fiction[numFicBooks];
   for (int i=0;i<numFicBooks;i++)
   {
    ficBooks[i]=new Fiction();
    ficBooks[i].getPublisherDetails();
    ficBooks[i].getBookDetails();
    ficsBooks[i].getFictiondetails();
    }
    System.out.println("\n Literature Books:");
    for(Literature litBook:litBooks)
    {
litBook.dispalyBookDetails();
System.out.println();
}
System.out.println("\nFiction Books:");
for(Fiction ficBook;ficBooks)
{
 ficBook.dispalyBookDetails();
 System.out.println();
 }
 }

   
