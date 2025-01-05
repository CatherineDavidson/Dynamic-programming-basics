import java.util.*;
class Main {
    static int memo[]=new int[10];
    public static int fibbo(int n)
      {
        if(n<=1)
            return n;
        if(memo[n]!=-1)
        {
            return memo[n]=fibbo(n-1)+fibbo(n-2);
        }
        return memo[n];
      }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        fibbo(n);
        for(int i=0;i<n;i++)
        memo[n]=-1;
        memo[0]=0;
        memo[1]=1;
        for(int i=0;i<n;i++)
        {
            System.out.print(memo[i]+" ");
        }
      }
}
