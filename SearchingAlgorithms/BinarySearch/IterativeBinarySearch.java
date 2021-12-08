
import java.util.*;

public class IterativeBinarySearch {

   static boolean binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x)
                return true;
            if (arr[m] < x)
                l = m + 1;
 
           
            else
                r = m - 1;
        }

        return false;
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
        if(binarySearch(arr, x)){
            System.out.println("Number Found");
        }
        else System.out.println("Not Found");
        
        
        
       
    }
}
