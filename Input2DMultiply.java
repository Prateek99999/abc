import java.util.Scanner;
class Input2DMultiply
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter order of first matrix :");
int a=sc.nextInt();
int b=sc.nextInt();

System.out.println("enter order of second matrix :");
int m=sc.nextInt();
int n=sc.nextInt();

int arr[][]=new int[a][b];
int arr2[][]=new int[m][n];
int result[][]=new int[a][n];

System.out.println("enter elements of array 1 :");

for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
arr[i][j]=sc.nextInt();
}}

System.out.println("enter elements of array 2 :");
System.out.println("array 2:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{

arr2[i][j]=sc.nextInt();
}}


System.out.println("array 1: (order :"+a+"x"+b+") ::");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{

System.out.print(arr[i][j]);
System.out.print(" ");
}
System.out.println();
}



System.out.println("array 2: (order :"+m+"x"+n+") ::");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(arr2[i][j]);
System.out.print(" ");
}
System.out.println();
}


if(b==m)
{

for(int i=0;i<a;i++)
{
for(int j=0;j<n;j++)
{
for(int k=0;k<m;k++)
{
result[i][j]=result[i][j]+arr[i][k]*arr2[k][j];
}
}
}


System.out.println("product is (order :"+a+"x"+n+") ::");
for(int i=0;i<a;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(result[i][j]);
System.out.print(" ");
}
System.out.println();
}

}

else
{
System.out.println("product not possible");
}

}}
