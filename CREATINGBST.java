
import java.util.*;


public class CREATINGBST {
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


    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);
    }

    static void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
       // System.out.print(root.data);
        Postorder(root.right);
        System.out.print(root.data);
    }

    static void levelOrder(Node root){
        if(root==null){
                return;
        }
        Queue<Node>  q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node newNode= q.remove();
            if(newNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
            }
            else{
                System.out.print(newNode.data+" ");
                if(newNode.left!=null){
                    q.add(newNode.left);
                }
                if(newNode.right!=null){
                    q.add(newNode.right);
                }
            }
        }

        
    }

    public static void main(String[] args) {
       // BST tr= new BST();
        int nodes [] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BST tr= new BST();
        Node root=tr.BUILDTREE(nodes);
       // preorder( tr.BUILDTREE(nodes));
        levelOrder(root);
    
        
    }
}
