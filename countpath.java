public class countpath {
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(path(n,m,0,0));
    }
    static int path(int n,int m,int i,int j){
        if(i==n || j==n){
            return 0;
        }
        if(i==n-1 && j==m-1 ){
            return 1;
        }
       int down= path(n, m, i+1, j);///downside
        int right= path(n, m, i, j+1);///rigth side
        return down+right;
    }
}
