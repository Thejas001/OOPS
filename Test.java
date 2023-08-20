import org.calc.Add;
import org.calc.Sub;
import org.calc.Multiply;
import org.calc.Divide;
import java.util.*;
public class Test{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number ,a:");
int a=sc.nextInt();
System.out.println("Enter the number ,b:");
int b=sc.nextInt();
Add add=new Add(a,b);
System.out.println("Addition:a+b="+add.add());
Sub s=new Sub(a,b);
System.out.println("Substraction:a-b="+s.sub());
Multiply m =new Multiply(a,b);
System.out.println("Multiply:a*b="+m.mul());
Divide d =new Divide(a,b);
System.out.println("Division:a/b="+d.div());
}
}
