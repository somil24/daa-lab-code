package HeapSort;
import java.util.*;
public class HeapSort {

    static void sort(int arr[])
    {
        int n = arr.length;
 
        
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
       
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
             heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[],int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && arr[l]>arr[largest])
        largest=l;

        if(r<n && arr[r]>arr[largest])largest=r;

        if(largest !=i){
            swap(arr, i, largest);

            heapify(arr, n, largest);
        }
    }

    static void swap(int[] arr,int n,int largest){
        int temp=arr[n];
        arr[n]=arr[largest];
        arr[largest]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
