import java.util.Scanner;

public class Binomial {

    static int binomial(int n,int k){
        int C[]=new int[n+1];
        C[0]=1; //nC0=1
        for(int i=1;i<=n;i++){
            for(int j=Math.min(i, k);j>0;j--){
                C[j]+=C[j-1];
            }
        }
        return C[k];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=binomial(n, k);
        System.out.println(ans);
        sc.close();
    }
    
}
