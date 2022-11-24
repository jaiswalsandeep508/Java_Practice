// Write a program to find the factorialof any number entered by the user.

import java.util.*;

public class Factorial{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int fact=1;
    int n = sc.nextInt();

    while(n>0){
      fact=fact*n;
      n--;
    }
    System.out.println("Factorial of number: " + fact);
  }
}