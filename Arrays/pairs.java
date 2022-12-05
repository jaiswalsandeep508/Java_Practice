import java.util.*;

public class pairs {
  
  public static void pair(int array[]){
    int size=array.length;
        
    for(int i=0;i<size;i++){
      int curr = array[i];
    
      for(int j=i+1;j<size;j++){
        System.out.print("  " + "( " + array[i]+ "," + array[j] + " )");
      }
    
    } 
      
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

    System.out.print("Possible pairs of array Elements: ");
    pair(array);
  }
}