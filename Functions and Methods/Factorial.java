import java.util.*;

public class Factorial{
  
  public static int Fact(int n){
    
    int fact=1;
    
    for(int i=1;i<=n;i++){
      fact = fact*i;
    }

    return fact;
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int a = sc.nextInt();

    System.out.println(Fact(a));
  }
}