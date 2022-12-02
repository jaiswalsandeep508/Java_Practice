import java.util.*;

public class BinToDec {

  public static int Bin(int biNum){
    int pow = 0;
    int dec = 0;
    
    while(biNum>0){
      int lastDigit = biNum%10;

      dec = dec + (lastDigit * (int)Math.pow(2, pow));

      pow++;

      biNum=biNum/10;
    }

    return dec;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any Binary Number: ");
    int biNum = sc.nextInt();
    
    System.out.println("Decimal of " + biNum + " is: " + Bin(biNum));

  }
}