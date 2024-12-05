
import java.util.HashSet;
import java.util.Iterator;

public class hash{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        set.remove(2);
        if(set.contains(2)){
            System.out.println("contains");
        }
        else{
            System.out.println("nooo");
        }

        //////ITERATOR 
        Iterator i = set.iterator();
        while (i.hasNext()) {
           System.out.println( i.next());
            
        }
    }
}