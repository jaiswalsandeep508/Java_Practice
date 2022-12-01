import java.util.*;

public class Product{
  
  public static int Multiply(int a,int b){
    return a*b;
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any 2 numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(Multiply(a,b));
  }
}