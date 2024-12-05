
import java.util.Scanner;

public class occr {
    public static void main(String[] args) {
        Scanner me =new Scanner(System.in);
        String s=me.nextLine();
        int f=-1,l=-1;
        char cur=me.next().charAt(0);
        int n;
        oc(s,f,l,cur,0);
    }
    static void oc(String s,int f,int l,char  cur,int n){
        if(n==s.length()){
            System.out.println(f);
            System.out.println(l);
            return;
        }
        if(cur==s.charAt(n)){
            if(f==-1){
                f=n;
            }
            else{
                l=n;
            }
        }
        oc(s, f, l, cur, n+1);
    }
}
