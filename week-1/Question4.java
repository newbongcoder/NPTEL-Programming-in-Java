import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
int m=n;
while(n!=0)
{
  int r=n%10;
  n/=10;
  result+=Math.pow(r,3);
}
if(result==m)
{
  System.out.print(1);
}
else
{
  System.out.print(0);
}
 }
}
