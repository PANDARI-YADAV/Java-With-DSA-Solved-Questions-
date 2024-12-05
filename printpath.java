
import java.util.ArrayList;

public class printpath {
    static  class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }

    static Node BSTCREATE(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
           root.left= BSTCREATE(root.left, val);
        }
        else{
          root.right=  BSTCREATE(root.right, val);
        }
        return root;
    }

    static void root2leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printpat(path);
        }
        else{
            root2leaf(root.left, path);
            root2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
static void printpat(ArrayList<Integer> path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+"-->");
    }
    System.out.println("null");
}

    public static void main(String[] args) {
        int values [] ={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
           root= BSTCREATE(root, values[i]);
        }
        ArrayList<Integer> path = new ArrayList<>();
        root2leaf(root, path);
    }
}
