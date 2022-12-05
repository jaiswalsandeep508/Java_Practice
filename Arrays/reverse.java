import java.util.*;

public class reverse {
  
  public static void reverseArray(int array[]){
    int size=array.length;
    int f=0;
    int l=size-1;
    
    for(int i=0;i<size;i++){
        while(f<l){
          int temp = array[f];
          array[f]=array[l];
          array[l]=temp;

          f++;
          l--;
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

    reverseArray(array);


    System.out.print("Elements after Reverse: ");
    for(int i=0; i<size; i++){
      System.out.print("  " + array[i]);
    }
  }
}