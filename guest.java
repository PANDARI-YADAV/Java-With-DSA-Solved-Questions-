public class guest {
    public static void main(String[] args) {
    int n=4;
   System.out.println( pair(n));
    }
    static int pair(int n){
        if(n<=1){
            return 1;
        }


        //single
        int sigl=pair(n-1);
        int p=(n-1)*pair(n-2);
        return sigl+p;
    }
}
