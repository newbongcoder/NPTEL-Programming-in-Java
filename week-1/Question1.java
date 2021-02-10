import java.util.*;
public class Question1 {
  public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextDouble();
    double perimeter;
    double area;
    
    if(radius>0)
    {
      perimeter = 2*Math.PI*radius;
      area = Math.PI*Math.pow(radius,2);
      System.out.print(perimeter +"\n"+area);
     }
     else
     {
      System.out.print("please enter non-zero positive number ");
      }
     }
     }
      
