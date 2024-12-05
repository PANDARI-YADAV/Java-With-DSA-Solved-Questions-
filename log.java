public class log {
    public static void main(String[] args) {
         int x=2;
         int n=5;
         System.out.println(sum(x,n));
    }
    static int sum(int x,int n){
        if(n==0)
        {
            return 1;

        }
        if(x==0)
        {
                return 0;
        }
        else{
            if(n%2==0)
            {
                
                return sum(x, n/2)*sum(x, n/2);
            }
                
                return sum(x, n/2)*sum(x, n/2)*x;
        }
    }

}
