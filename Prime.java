# Prime
import java.io.*;
import java.util.*;
public class Primesimple
{
public static void main(String args[])
{
int temp;
boolean isPrime=true;
Scanner c = new Scanner(System.in);
System.out.println("Enter a number for check");
int n=c.nextInt();
for(int i=2;i<=n/2;i++)
{
temp= n%i;
if(temp==0)
{
isPrime=false;
break;
}
}
if(isPrime)
System.out.println(n + " is the prime number");
else
System.out.println(n + " is not prime number");
}
}
