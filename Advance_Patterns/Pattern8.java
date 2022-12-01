/*----------------\
              
            1
          2   2
        3   3   3
      4   4   4   4
    5   5   5   5   5         

----------------*/ 

import java.util.*;

public class Pattern8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int n = sc.nextInt();
  
    for(int i=1;i<=n;i++){
     for(int j=1;j<=n-i;j++){
      System.out.print("  ");
     }
     for(int j=1;j<=i;j++){

      if(((i)%2!=0 && (i+j)%2==0) || ((i)%2==0 && (i+j)%2==0)){
          System.out.print(i + " ");
        }
      //else  if((i)%2!=0 && (i+j)%2!=0){
      //     System.out.print(i + " ");
      // }
      else{
        System.out.print("* ");
      }
     }
      System.out.println();
    }      
  }
}