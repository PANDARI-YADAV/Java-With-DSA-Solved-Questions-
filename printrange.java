public class printrange {
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


//////////SEARCH KEY 



static boolean Search(Node root,int key){
    if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    if(root.data>key){
        return Search(root.left, key);

    }
    else{
        return Search(root.right, key);
    }

}



static Node DELETE(Node root,int val){
    if(root.data>val){
        root.left=DELETE(root.left, val);
    }
    else if(root.data<val){
        root.right=DELETE(root.right, val);
    }
    else{
        ///when root.data ==== value
        ////case - 1
        if(root.left==null && root.right==null){
            return null;
        } 


        ////// CASE-2

        if(root.right==null){
            return root.left;
        }
       else if(root.left==null){
            return root.right;
        }

        /// CASE-3 

        Node IS = inorderSuccer(root.right);
        root.data=IS.data;
        root.right=DELETE(root.right, IS.data);

    }
    return root;
}


        static Node inorderSuccer(Node root){
            while (root.left!=null) { 
                root=root.left;
            }
            return root;}

static void printrangenum(Node root,int x,int y){
    if(root==null){
        return;
    }
    if(root.data>=x && root.data<=y){
        printrangenum(root.left, x, y);
        System.out.print(root.data+" ");
        printrangenum(root.right, x, y);
    }
    else if(root.data<x){
        printrangenum(root.right, x, y);
    }
    else{
        printrangenum(root.left, x, y);
    }
}

    public static void main(String[] args) {
        int values [] ={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
           root= BSTCREATE(root, values[i]);
        }
        Inorder(root);
        System.out.println();
        if(Search(root, 9)){///////////////////////////////////////TIME COMPLEXITY   O(H) or O(N)
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }


        // DELETE(root, 4);
        // Inorder(root);
        printrangenum(root, 2, 6);

    }
}
