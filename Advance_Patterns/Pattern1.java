/*-------------------
     * 
    **
   ***
  ****
 *****
--------------------*/ 

import java.util.*;

public class Pattern1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any Number: ");
    int n = sc.nextInt();
  
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){   //Spaces
        System.out.print("  ");
      }
      for(int k=1;k<=i;k++){     //Star
      System.out.print("* ");
      }
      System.out.println();
    }
    
  }
}