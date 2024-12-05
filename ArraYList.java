
import java.util.ArrayList;
import java.util.Collections;

public  class ArraYList{
    public static void main(String[] args) {
        ArrayList<Integer> me = new ArrayList<>();
        me.add(1);
        me.add(45);
        me.add(36);
        System.out.println(me);
        me.add(1,100);
        System.out.println(me);
        me.remove(1);
        System.out.println(me);
        System.out.println(me.get(2));
        Collections.sort(me);
        System.out.println(me);
        Collections.reverse(me);
        System.out.println(me);
        

    }
}