import java.util.Scanner; 
public class Perfect_Number {  
public static void main(String args[]) {  
	//Logic
int i,n,sum=0;
//Creating the objects
Scanner sc=new Scanner(System.in); 
System.out.println("Please enter the any number:");
n=sc.nextInt();
//Check the conditions
for (i= 1; i < n; i++)
  {
	if (n % i == 0)
        sum = sum + i;
  }
//Execute the no is perfect or not

if (sum == n)
  System.out.println (n + " Is a perfect number");
else
  System.out.println (n + " Is not a perfect number");

}
}


/*
Please enter the any number:
28
28 Is a perfect number

*/