public class countNodesBst {
    static class Node{
         int data;
         Node left;
         Node right;

         Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }

    static class BST{
        static int idx=-1;
        static Node BUILDTREE(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=BUILDTREE(nodes);
            newNode.right=BUILDTREE(nodes);
            return newNode;
            
        }
    }

    static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countNode(root.left);
        int rightnodes = countNode(root.right);
        return leftNodes+rightnodes+1;
    }

    public static void main(String[] args) {
        // BST tr= new BST();
         int nodes [] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         BST tr= new BST();
         Node root=tr.BUILDTREE(nodes);
        // preorder( tr.BUILDTREE(nodes));
         System.out.println(countNode(root));
     
         
     }
}
