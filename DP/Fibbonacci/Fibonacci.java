import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n,int mem[]){
        if(n==0 || n==1)return n;
        if(mem[n]!=0)return mem[n];
        return fibonacci(n-1, mem)+fibonacci(n-2, mem);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mem[]=new int[n+1];
        int ans=fibonacci(n,mem);
        System.out.println(ans);
        sc.close();
    }
}
