
 //Print only reverse of number without affected on atual number 

import java.util.*;

public class reverse{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    while(n>0){
      int lastDigit = n%10;
      System.out.print(lastDigit);                
      n = n/10;
    }
  }
}