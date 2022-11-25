import java.util.*;

public class TotalCost {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Enter price of Pencil: ");
    float pencil = sc.nextFloat();
    
    System.out.println("Enter price of Pen: ");
    float pen = sc.nextFloat();
    
    System.out.println("Enter price of Eraser: ");
    float eraser = sc.nextFloat();

    double total = pencil+pen+eraser;
    double totalPrice = total+(total*0.18);
    System.out.println("Total Price: " + totalPrice);
  }
}