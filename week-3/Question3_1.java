import java.util.*;
public class Fibonacci { 

public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();// Take input from the user
System.out.println(fib(n)); 
    } 
static int fib(int n) // the Fibonacci Function
{


        if (n==1)      
            return 0;
        else if(n==2)
            return 1; 			
return fib(n - 1) + fib(n - 2); 


}
}
