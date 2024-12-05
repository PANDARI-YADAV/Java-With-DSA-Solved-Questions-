
import java.util.*;

public class gt {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Scanner me = new Scanner(System.in);
        System.out.println("enter how many number you can enter");
        int m =me.nextInt();
        for(int i=0;i<m;i++){
        System.out.println("enter number ranze from 1 - 50");
        int n = me.nextInt();
        if(n>50){
            System.out.println("enter number range from 1 -50");
            return;
        }
        list.add(n);
    }
    System.out.println(list);
    for(int i=0;i<list.size();i++){
        if(list.get(i)>25){
            list.remove(i);
        }
        System.out.print(list.get(i));
    }

    }
}
