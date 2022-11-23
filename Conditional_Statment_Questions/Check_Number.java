import java.util.*;

public class Check_Number{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if(n>=0)
    {
      System.out.print("Number is POSITIVE ");
    }else {
      System.out.print("Number is NEGITIVE ");
    }
  }
}