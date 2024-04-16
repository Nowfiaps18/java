class Matrix{
int m,n,i,j;
int[][]a=new int[5][5];
int[][]b = new int[5][5];
int[][]c =new int[5][5];
Scanner sc=new Scanner (System.in);
{
System.out.print("Enter no:of rows:");
m=sc.nextInt();
System.out.println("Enter elements of matrixA");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextInt();
System.out.println("Enter elements of MatrixB");
for(i=0;i<;i++)
for(j=0;j<n;j++)
b[i][j]=sc.nextInt();
void add(){
for(i=0;i<m;i++)
for(j=0;j<n;j++)
c[i][j]=a[i][j]+b[i][j];
}
void display()
{
System.out.println("matrix A");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+"");}
System.out.println();
}
System.out.println("matrix B");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+"");
System.out.println();
}
System.out.println("matrix c");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(c[i][j]+"");
system.out.println();
public class AddMatrix2
{
 public static void main(String[]args)
 {
  Matrix ob=new Matrix();
  ob.get();
  ob.add();
  ob.display():
  }
  }
