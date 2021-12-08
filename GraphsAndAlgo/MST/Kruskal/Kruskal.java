
import java.util.*;

public class Kruskal {
    static Map<Integer, Integer> parent = new HashMap<>();
 
    
    public static void makeSet(int[] universe)
    {
        
        for (int i: universe) {
            parent.put(i, i);
        }
    }
 
    
    public static int Find(int k)
    {
       
        if (parent.get(k) == k) {
            return k;
        }
 
        
        return Find(parent.get(k));
    }
 
    
    public static void Union(int a, int b)
    {
       
        int x = Find(a);
        int y = Find(b);
 
        parent.put(x, y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int set[]=new int[9999];
        for(int i=0;i<9999;i++){
            set[i]=i;
        }
        makeSet(set);

        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();

        List<int []> edges=new ArrayList<>();

        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
           edges.add(new int[]{w,u,v});
        }
      //  Collections.sort(edges);
        int cost=0;
        for(int[] i:edges){
            int w=i[0];
            int u=i[1];
            int v=i[2];
            int x=Find(u);
            int y=Find(v);
            if(x==y)continue;
            else{ 
                cost+=w;
                Union(u, v);}
        }
        System.out.println("Cost is "+cost);
        sc.close();
    }
}
