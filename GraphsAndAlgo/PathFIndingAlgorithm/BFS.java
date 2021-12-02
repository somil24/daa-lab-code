import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class BFS {
    static void bfs(int s,int AdjMat[][],int n){
        boolean visited[]=new boolean[n];
        Arrays.fill(visited, false);
        LinkedList<Integer> queue=new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0){
            s=queue.poll();
            System.out.println(s);
            for(int i = 0; i < n; i++)
            {
                if (AdjMat[s][i] == 1 && (!visited[i]))
                {
                     
                  
                    queue.add(i);

                    visited[i] = true;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int AdjMat[][]=new int[][]{{
           0,1,1,1,1},
            {1,0,0,0,0},
            {1,0,0,0,0},
            {1,0,0,0,0},
            {1,0,0,0,0}
        };
        // int AdjMat[][]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         AdjMat[i][j]=sc.nextInt();
        //     }
        // }
        bfs(1,AdjMat,n);
        sc.close();
    }
}
