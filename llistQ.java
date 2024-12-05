public class llistQ {
    
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            next=null;
        }
        
    }

    static  class Quee{
        static Node head=null;
        static Node tail=null;
        
        public static  boolean isEmpty(){
            return head==null & tail==null;

        }

        public static void Enquee(int data){
            Node NewNode=new Node(data);
            if(tail==null){
                tail=head=NewNode;
                return;
            }
            tail.next=NewNode;
            tail=NewNode;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return  front;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            Node newN=head;
            while(newN!=null){
                System.out.println(newN.data+ " ");
                newN= newN.next;
            }
            System.out.println("null");
            return -1;
        }
    }




    public static void main(String[] args) {
        Quee s = new Quee();
        s.Enquee(1);
        s.Enquee(2);
        s.Enquee(3);
        s.Enquee(4);
        s.peek();

    }
}
