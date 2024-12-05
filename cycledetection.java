import java.util.*;
public class cycledetection {
    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        int n = me.nextInt();
        String str = String.valueOf(n);
        int c=0;
        for(int i=0;i<str.length();i++){
            c+=1;
        }
        System.out.println(c);
    }
}
