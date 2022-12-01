import java.util.*;

public class BinomialCoefficient{
  
  public static int Fact(int n){
    
    int fact=1;
    
    for(int i=1;i<=n;i++){
      fact = fact*i;
    }

    return fact;
  }
  
  public static int Binomial(int n, int r){
    int ans;

    int nFact = Fact(n);
    int rFact = Fact(r);
    int nrFact = Fact(n-r);

    ans = nFact/(rFact*nrFact);

    return ans;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n and r respectively: ");
    int n = sc.nextInt();
    int r = sc.nextInt();

    System.out.println(Binomial(n,r));
  }
}