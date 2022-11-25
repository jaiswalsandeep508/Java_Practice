/*-------------------------
*
**
***
****
*****
--------------------------*/ 

import java.util.*;

public class Star{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Number of Line: ");
    int line = sc.nextInt();

    for(int i=1;i<=line;i++){
      for(int star=1;star<=i;star++){
        System.out.print("* ");
      }
      System.out.println( );
    }

  }
}