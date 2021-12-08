
import java.util.Arrays;
import java.util.Scanner;

class Dijkstras {
    static final int INF=Integer.MAX_VALUE;

    static int minDistance(int dist[],Boolean setShortestPath[],int V){
        int min=Integer.MAX_VALUE,minIndex=-1;
        for(int v=0;v<V;v++){
            if(setShortestPath[v]==false && dist[v]<=min){
                min=dist[v];
                minIndex=v;
            }
        }
        return minIndex;
    }

    static void dijkstras(int graph[][],int src,int dist[],int vertices){
        Boolean setShortestPath[]=new Boolean[vertices];
        Arrays.fill(setShortestPath, false);
        for(int count=0;count<vertices-1;count++){
            int u=minDistance(dist, setShortestPath, vertices);
            setShortestPath[u]=true;

            for(int v=0;v<vertices;v++){
                if(!setShortestPath[v] && graph[u][v]!=0 && dist[u]!=INF && dist[u]+graph[u][v]<dist[v])
                dist[v]=dist[u]+graph[u][v];
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.println(i+" -> " + dist[i]);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int vertices=sc.nextInt();
        int edges=sc.nextInt();
        int dist[]=new int[vertices];
        Arrays.fill(dist, INF);
    //    ArrayList<ArrayList> graph=new ArrayList<>(vertices);
    //  //  int graph[][]=new int[vertices+1][2];
    //     for(int i=0;i<edges;i++){
    //         int u=sc.nextInt();
    //         int v=sc.nextInt();
    //         int w=sc.nextInt();
            
    //         ArrayList<Integer> A={v,w};
    //         ArrayList<Integer> B={u,w};
    //         graph.get(u).add(A);
    //       //  graph.get(u).add(w);

    //         graph.get(v).add(B);
    //        // graph.get(v).add(w);
    //     }
    int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

        int source=sc.nextInt();
        dist[source]=0;
        
        dijkstras(graph, source, dist,vertices);
        sc.close();

    }
}