import java.util.*;
public  class GRAPH{
    static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }

   static void CreateGraph(ArrayList<Edge> graph[]) {
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<Edge>();
    }
    //1st vertex edges
    graph[0].add(new Edge(0, 2, 2));

    // 2nd vertex edges

    graph[1].add(new Edge(1, 2, 10));
    graph[1].add(new Edge(1, 3, 0));

    //3rd vertex edges

    graph[2].add(new Edge(2, 0, 2));
    graph[2].add(new Edge(2, 1, 10));
    graph[2].add(new Edge(2, 3, -1));

    // 4th vertex edges

    graph[3].add(new Edge(3, 1, 0));
    graph[3].add(new Edge(3, 2, -1));
    

   }

static void bfs(ArrayList<Edge> graph[] ,int v,boolean vis[],int start){
    Queue<Integer> q = new LinkedList<>();
  

    q.add(start);
    while(!q.isEmpty()){
        int cur = q.remove();
        if(vis[cur]==false){
            System.out.print(cur+" ");
            vis[cur]=true;
        }
        for(int i=0;i<graph[cur].size();i++){
            Edge e = graph[cur].get(i);
            q.add(e.dest);
        }
    }
}


static void DFS(ArrayList<Edge> graph[],int cur,boolean vis[]){
    System.out.println(cur+" ");
    vis[cur]=true;
    for(int i=0;i<graph[cur].size();i++){
        Edge e = graph[cur].get(i);
        if(vis[e.dest]==false){
        DFS(graph, e.dest, vis);
    }}

}

static void printPaths(ArrayList<Edge> graph[], boolean vis[], int cur, String path, int target) {
    if (cur == target) {
        System.out.println(path);
        return;
    }
    
    // Correct: Mark the current node as visited
    vis[cur] = true;

    for (int i = 0; i < graph[cur].size(); i++) {
        Edge e = graph[cur].get(i);

        // Correct path construction with better readability
        // Change to append ` -> ` to indicate the flow between nodes
        if (!vis[e.dest]) {
            printPaths(graph, vis, e.dest, path + " -> " + e.dest, target);
        }
    }

    // Corrected Backtracking: Unmark the current node
    // This unmarking allows the algorithm to revisit the node from other potential paths.
    vis[cur] = false;  // Unmark after the recursive call for proper backtracking
}

    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreateGraph(graph);
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                System.out.print(e.src+" "+e.dest+" "+e.weight+" ");
            }
            System.out.println();
        }


        System.out.println();
        //bfs(graph, v);
        boolean vis[] = new  boolean[v];
        // for(int i=0;i<v;i++){
        //     if(vis[i]==false){
                DFS(graph, 0, vis);
        //     }
        // }

        System.out.println("PATHS OF SOURCE TO DEST");

        printPaths(graph, vis, 0, "0", 1);
    }
}