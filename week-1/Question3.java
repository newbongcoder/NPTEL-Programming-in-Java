import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
//Use for or while loop do the operation.
int i=0;
while(i<n)
{
  if(i%3==0)
  {
    sum+=i;
  }
  i+=2;
}
System.out.print(sum);
 }
}
