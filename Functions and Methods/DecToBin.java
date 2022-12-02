import java.util.*;

public class DecToBin {

  public static int Dec(int decNum){
    int pow = 0;
    int bin = 0;
    
    while(decNum>0){
      int rem = decNum % 2;

      bin = bin + (rem * (int)Math.pow(10, pow));

      pow++;

      decNum = decNum/2;
    }

    return bin;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any Decimal Number: ");
    int decNum = sc.nextInt();
    
    System.out.println("Binary of " + decNum + " is: " + Dec(decNum));

  }
}