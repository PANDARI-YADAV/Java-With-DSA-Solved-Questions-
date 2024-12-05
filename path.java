public class path {
    public static void main(String[] args) {
        int n=2, m=2;
        System.out.println(paths(n,m));

    }
    static  int paths(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vert=paths(n-m, m);
        int hori=paths(n-1, m);
        return vert+hori;
    }
}
