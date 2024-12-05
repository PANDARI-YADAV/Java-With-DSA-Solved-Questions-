
import java.util.LinkedList;

public class LIkedLst {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<>();
        List.add("Panda");
        List.addFirst("hiii");
        List.addLast("you");
        System.out.println(List);
        System.out.println(List.size());
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+"-->");
        }
        System.out.println("null");

        List.removeFirst();
        List.removeLast();
        List.remove(0);
        System.out.println(List);
    }
}
