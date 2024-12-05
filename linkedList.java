



class LL{
    Node Head;
    private int Size;
        LL(){
            this.Size=0;
        }


    class Node{
        int data;     /////attributes we re quired to create node
        Node Next;



         Node(int data) { ///////////first node creation
            this.data=data;
            this.Next=null;
            Size++;
        }

        
    }
    ////// INSERT NODE AT FRONT
    public void ADDfIRST(int data){
        Node NewNode=new Node(data);
        if(Head==null){
            Head=NewNode;                   ////// if firwst head null add at head otherwise do fisrt node as newnode and heaqd 
            return;
        }
    
        NewNode.Next=Head;
        Head=NewNode;

    }
    /////// INSERT AT END OF LINKED LIST 
    public void ADDEnd(int data){       ////// if firwst head null add at head otherwise do fisrt node as newnode
        Node newNode= new Node(data);
        if(Head==null){   
            Head=newNode;
            return;
        }
        
        Node currNode = Head;
        while(currNode.Next!=null){
            currNode=currNode.Next;      ///// it work upto getting last node as=fter getting last node it will addd there
        }
        currNode.Next=newNode;

    }

    public void printg(){
        if(Head==null){   
            System.out.println("LINIKED LIST IS EMPTY");
            return;
        }
        Node currNode = Head;
        while(currNode!=null){
            System.out.print(currNode.data+" ---> ");
            currNode=currNode.Next;      ///// it work upto getting last node as=fter getting last node it will addd there
        }
        System.out.print("null");
    }


    //////DELETE AT FRIST
    public void deleteFirst(){
        if(Head==null){
            System.out.println("list is empty");
            return;
        }
        Size--;
        // if(Head.Next==null){
        //     Head=null;
        //     return;
        // }
        Head=Head.Next;

    }


    ///// DELETE AT END

    public void deleteEnd(){
        if(Head==null){
            System.out.println("list is empty");
            return;
        }
        Size--;
        if(Head.Next==null){
            Head=null;
            return;
        }
        Node secondLastNode=Head;
        Node LastNode=Head.Next;
        while(LastNode.Next!=null){
            LastNode=LastNode.Next;
            secondLastNode=secondLastNode.Next;
        }
        secondLastNode.Next=null;

    }

    public int  getSize(){
        return Size;
    }
    


   /*  public void reverseLinkedList(){
        if(Head==null || Head.Next==null){
            return;
        }
        Node prevnode=Head;
        Node currNode=Head.Next;
        while(currNode!=null){
            Node NEwNExtNode=currNode.Next;
            currNode.Next=prevnode;


            //update

            prevnode=currNode;
            currNode=NEwNExtNode;
        }
       
        Head.Next=null;
        Head=prevnode;


    }*/




///////BY RECURSIVELY


public Node Revere(Node Head){
if(Head==null|| Head.Next==null){
    return Head;
}
    Node NewNode = Revere(Head.Next);
    Head.Next.Next=Head;
    Head.Next=null;
    return NewNode;
}

}








public class linkedList {
    public static void main(String[] args) {
        LL list=new LL();
        list.ADDfIRST(1);
        list.ADDEnd(2);
        list.ADDEnd(3);
        list.ADDfIRST(100);
        list.printg();
        System.out.println();
        list.deleteEnd();
        list.deleteFirst();
        list.printg();
        System.out.println();
       System.out.println( list.getSize());

       //list.reverseLinkedList();
       list.Head= list.Revere(list.Head);


       list.printg();
    
}}
