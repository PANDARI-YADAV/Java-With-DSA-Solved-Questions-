public class createbst {
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


    static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }


    public static void main(String[] args) {
        int values [] ={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
           root= BSTCREATE(root, values[i]);
        }
        Inorder(root);
        System.out.println();

    }
}
