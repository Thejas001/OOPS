import java.util.Scanner;
public class LinearSearch{
public static void main(String [] args){
int c,n,search,array[];
Scanner in=new Scanner(System.in);
System.out.println("enter_number_of_elements");
n=in.nextInt();
array=new int[n];
System.out.println("enter_those_"+n+"_elements");
for(c=0;c<n;c++)
array[c]=in.nextInt();
System.out.print("Enter_value_to_find");
search=in.nextInt();
for(c=0;c<n;c++)
	if(array[c]==search)
	{
		System.out.println(search+"_is_present_at_location_"+(c+1));
		break;
	}
	if(c==n)
		System.out.println(search+"_isnt_present_in_array");
}
}