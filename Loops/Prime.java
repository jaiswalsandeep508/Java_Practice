import java.util.*;

public class Prime{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    boolean isPrime = true;
    System.out.println("Enter any Number: ");
    int n = sc.nextInt();

    if(n==2){
      isPrime=false;
    }else{
      for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
          isPrime=false;
        }
      }
    }
        if(isPrime){
            System.out.println(n + " is Prime ");
        }
        else{
            System.out.println(n + " is Not Prime! ");
        }

  }
}