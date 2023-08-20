import java.io.IOException;
import java.util.Scanner;
class MyException extends Exception
{
public MyException(String str)
{
System.out.println(str);
}
}
public class SignException {
 public static void main(String[] args)throws IOException {
     System.out.println("Enter number of inputs::");
	 Scanner sc= new Scanner(System.in);
	 int n=sc.nextInt();
	 int k=0,sum=0;
	 Integer mynumbers[]=new Integer[n];
	 while (n>0){
	     try {
		 System.out.print("Enter number::");
		 int num=sc.nextInt();
		 if(num<0)
		 throw new MyException("Number is negative");
		 else{
		 mynumbers[k]=num;
		 sum=sum+num;
		 k++;
		 }
		 n--;
		 }catch (MyException m){
		 System.out.println(m);
		 }
		 }
		 System.out.println("The average is"+sum/k);
		 }
		 }