public class  CIRCULARQUEE {
    



    static class  Quee{
    static int size;
    static int rear=-1;
    static int front =-1;
    static int [] arr;
    public Quee(int size) {
        arr= new int [size] ;
        this.size=size;
    }
    public static boolean isEmpty(){
        
            return rear==-1 && front ==-1;
        
    }
    public static boolean  isFull(){
        return (rear+1)%size==front;
    }

    public static void Enquee(int data){
        if(isFull()){
            System.out.println("full");
            return;
        }
        if(front==-1){
            front =0;
        }
        rear=(rear+1)%size;
        
        arr[rear]=data;
    }

    public static int dequee(){
        if(isEmpty()){
            System.out.println("null");
            return -1;
        }
        int n = arr[front];
        if(front==rear){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        
        return n;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("null");
            return -1;
        }
        return arr[front];
    }
            
    

    }
    public static void main(String[] args) {
        Quee me = new Quee(5);
        me.Enquee(1);
        me.Enquee(2);
        me.Enquee(3);
        me.Enquee(4);
        while(!me.isEmpty()){
            System.out.println(me.peek());
            me.dequee();
        }
    }


}
