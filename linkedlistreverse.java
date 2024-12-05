import java.util.*;
public class linkedlistreverse {
    

    public static void main(String[] args) {
        LinkedList<Integer> list = new  LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");


        rev(list);
    }


    static void rev(LinkedList<Integer> list){
            for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+"-->");
            }
            System.out.println("null");
    }
}


