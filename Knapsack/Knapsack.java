import java.util.*;
public class Knapsack {
    
    static double knapsack(int W,int weight[],int val[],int n){

        // int profit[][]=new double[n][3];

        // for(int i=0;i<n;i++){
        //     profit[i][0]=val[i];
        //     profit[i][1]=weight[i];
        // }

        double indexProfit[][]=new double[n][2];
        for(int i=0;i<n;i++){
            indexProfit[i][0]=(double)val[i]/weight[i];
            indexProfit[i][1]=i;
        }
        

        Arrays.sort(indexProfit, (a, b) -> Double.compare(a[0], b[0]));

        // for(int i=0;i<n;i++){
        //     System.out.println("Val is "+val[(int)indexProfit[i][1]]+" Weight is "+weight[val[(int)indexProfit[i][1]]]);
        //     }

        for(int i=0;i<n;i++){
            System.out.println("Profit is "+indexProfit[i][0]+" index is "+(int)indexProfit[i][1]);
            int index=(int)indexProfit[i][1];
            System.out.println("Val is "+val[index]+" Weight is "+weight[index]);
        }
        double p=0;
        for(int i=n-1;i>=0;i--){
            int index=(int)indexProfit[i][1];

            if(W-weight[index]>=0){
                W=W-weight[index];
              //  System.out.println(W);
                p=p+val[index];
              //  System.out.println(p);
            }
            else {
               // System.out.println((double)W/weight[index]);
                p=p+(double)val[index]*((double)W/weight[index]);
                break;
            }
        }

        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int val[]=new int[n];
        int weight[]=new int[n];

        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            weight[i]=sc.nextInt();
        }
        sc.close();

        System.out.println(knapsack(50,weight,val,n));
        

    }
}
