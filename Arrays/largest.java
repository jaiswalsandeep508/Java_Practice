import java.util.*;

public class largest {
  
  public static int find(int array[]){
    
    int largest = Integer.MIN_VALUE;

    for(int i=0;i<array.length;i++){
      if(array[i]>largest){
        largest = array[i];
      }
    }
   return largest;
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    int array[] = new int[size];

    System.out.print("Enter the Elements of array: ");
    for(int i=0;i<size;i++){
      array[i] = sc.nextInt();
    }

    System.out.println("Largest Value of array is: " + find(array));
  }
}