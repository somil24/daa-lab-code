
import java.util.*;
public class Prims {
    
    static final int INF= Integer.MAX_VALUE;

    static void prims(int graph[][],int v){
        int parent[]=new int[v];
        int cost[]=new int[v];

        Boolean visited[]=new Boolean[v];
        Arrays.fill(cost, INF);
        Arrays.fill(visited,false);

        cost[0]=0;
        parent[0]=-1;

        for(int count=0;count<v-1;count++){
            int u=minCost(cost,visited,v);
            visited[u]=true;

            for(int i=0;i<v;i++){
                if(graph[u][i]!=0 && visited[i]==false && graph[u][i]<cost[i]){
                    parent[i]=u;
                    cost[i]=graph[u][i];
                }
            }
        }

        for(int i=1;i<v;i++){
            System.out.println(parent[i]+" -- "+ i+"\t"+ graph[i][parent[i]]);
        }
    }

    static int minCost(int cost[],Boolean visited[],int v){
        int min=INF,minIndex=-1;

        for(int i=0;i<v;i++ ){
            if(visited[i]==false && cost[i]<min){
                min=cost[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

      // int v=sc.nextInt();
      int v=5;
       int graph[][]=new int[][]{ { 0, 2, 0, 6, 0 },
       { 2, 0, 3, 8, 5 },
       { 0, 3, 0, 0, 7 },
       { 6, 8, 0, 0, 9 },
       { 0, 5, 7, 9, 0 } };

       prims(graph, v);
       sc.close();
    //    for(int i=0;i<v;i++){
    //        for(int j=0;j<v;j++){
    //            graph[i][j]=sc.nextInt();
    //        }
    //    }
    }
}
