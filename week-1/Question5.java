import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
//Initialize maximum element as first element of the array.  
   //Traverse array elements to get the current max.
   //Store the highest mark in the variable result.
   //Store average mark in avgMarks.
i=0;
int max=0,avg=0;
while(i<s)
{
  if(max<arr[i])
  {
    max=arr[i];
  }
  avg+=arr[i];
  i++;
}
result=max;
mark_avg=avg/s;
System.out.print(result+"\n");
System.out.print(mark_avg);
  
 }
}
