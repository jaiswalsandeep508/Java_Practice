import java.util.*;

public class search {
  
  public static int linear(int array[], int key){
    for(int i=0;i<array.length;i++){
      if(array[i]==key){
        return i;
      } 
    }
    return -1;
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

    System.out.print("Enter the Key of array: ");
    int key = sc.nextInt();

    int value = linear(array,key);

    if(value==-1){
      System.out.println("Element is not found!!");
    }else{
      System.out.println("Element found at " + value);
    }
  }
}