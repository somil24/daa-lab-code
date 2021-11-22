package MergeSort;
import java.util.*;
public class MergeSort {
    
    static void sort(int arr[],int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    static void merge(int arr[],int l, int m,int r){
        int a1=m-l+1;
        int a2=r-m;

        int L[]=new int[a1];
        int R[]=new int[a2];

        for(int i=0;i<a1;i++){
            L[i]=arr[l+i];
    
        }
        for(int i=0;i<a2;i++){
            R[i]=arr[m+1+i];
        }

        int i=0,j=0;
        int k=l;
        while(i<a1 && j<a2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<a1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<a2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr, 0, n-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
