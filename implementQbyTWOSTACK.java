import java.util.Stack;

public class implementQbyTWOSTACK {
static class Quee{
    static Stack<Integer> s1 = new Stack<>();
    static  Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty(){
        return  s1.isEmpty() && s2.isEmpty();
    }
public static  void add(int data){
    while(!s1.isEmpty()){
        s2.push(s1.pop());
    }
    s1.push(data);
    while(!s2.isEmpty()){
        s1.push(s2.pop());
    }


}

public static int remove(){
    if(isEmpty()){
        return -1;
    }
    return s1.pop();
}


public static int peek(){
    if(isEmpty()){
        return -1;
    }
    return s1.peek();
}

}

    public static void main(String[] args) {
        Quee me = new Quee();
        me.add(1);
        me.add(2);
        me.add(3);
        me.add(4);
        while(!me.isEmpty()){
            System.out.println(me.peek());
            me.remove();
        }
    }
}
