// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;

public class SumDigits{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int choice;
    int sumEven=0;
    int sumOdd=0;

    do{
      System.out.println("Enter any number: ");
      int number = sc.nextInt();
      if(number%2==0){
        sumEven+=number;
      }else{
        sumOdd+=number;
      }

      System.out.println("If you want to continue press 1 etherwise press 0 ");
      choice = sc.nextInt();
    }while(choice==1);

    System.out.println("Sum of Even numbers: " + sumEven);
    System.out.println("Sum of Odd numbers: " + sumOdd);

  }
}