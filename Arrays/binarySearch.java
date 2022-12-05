import java.util.*;

public class binarySearch {
  
  public static int binary(int array[], int key){
    int size = array.length;
    int start = 0;
    int end = size-1;
    
  
      while(start<=end){
        int mid = (start+end)/2;

        if(array[mid]==key){
          return mid;
        }else if(array[mid]>key){
          end=mid-1;
        }else{
          start = mid+1;
        }
      }
       return -1;
  } 
    
   
  
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();

    int array[] = new int[size];
    System.out.print("Enter the Elements of array in sorted form: ");
    for(int i=0;i<size;i++){
      array[i] = sc.nextInt();
    }

    System.out.print("Enter the Key of array: ");
    int key = sc.nextInt();

    int value = binary(array,key);

    if(value==-1){
      System.out.println("Element is not found!!");
    }else{
      System.out.println("Element found at " + (value+1) + " Position: ");
    }
  }
}