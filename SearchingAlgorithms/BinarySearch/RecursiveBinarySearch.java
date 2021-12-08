
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {

    static void binarySearch(int[] arr,int x,int l,int r){
        int m = l + (r - l) / 2;
        if(arr[m]==x){
            System.out.println("Number found");
            return;
        }
        if(l>r){
            System.out.println("Number not found");
            return;
        }
        if(arr[m]>x)
        binarySearch(arr, x, l, m-1);
        else binarySearch(arr, x, m+1, r);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Which number do you want to find?");
        int x=sc.nextInt();
        Arrays.sort(arr);
        binarySearch(arr,x,0,n-1);
        sc.close();
        
    }
}
