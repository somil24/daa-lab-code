import java.util.*;
public class DFS {

   static void dfs(int s,int AdjMat[][],int n,Boolean visited[]){
       visited[s]=true;
       System.out.println(s);


       for(int i=0;i<n;i++){
           if(AdjMat[s][i]!=0 && !visited[i]){
               dfs(i, AdjMat, n, visited);
           }
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int AdjMat[][]=new int[][]{{
          0,1,1,0},
            {0,0,1,1},
            {1,0,0,0},
            {0,0,0,1}
            
        };
        // int AdjMat[][]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         AdjMat[i][j]=sc.nextInt();
        //     }
        // }
        Boolean visited[]=new Boolean[n];
        Arrays.fill(visited, false);
        dfs(2,AdjMat,n,visited);
        sc.close();
    }
}
