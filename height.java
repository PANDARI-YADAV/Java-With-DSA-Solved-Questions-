public class height {
    


    static class Nodes {
        int data;
        Nodes Left;
        Nodes rigth;
        Nodes(int data){
            this.data=data;
            this.Left=null;
            this.rigth=null;

        }
    }

    static class BST{
        static int idx=-1;
        static Nodes CREATINGBST(int Nodes[]){
            idx++;
            if(Nodes[idx]==-1){
                return null;
            }
            Nodes newNode = new Nodes(Nodes[idx]);
            newNode.Left=CREATINGBST(Nodes);
            newNode.rigth=CREATINGBST(Nodes);
            return newNode;

        }
    }
static int Height(Nodes root){
    if(root==null){
        return 0;
    }
    int leftnodes = Height(root.Left);
    int rightnodes = Height(root.rigth);
    int myhight = Math.max(leftnodes, rightnodes)+1;
    return  myhight;
}


static int DiameterBSt(Nodes root){
    if(root==null){
        return 0;
    }
    int leftNodes=DiameterBSt(root.Left);
    int rightnodes=DiameterBSt(root.rigth);
    int dime3 = Height(root.Left)+Height(root.rigth)+1;
    return Math.max(dime3, Math.max(leftNodes, rightnodes));
}


    public static void main(String[] args) {
        // BST tr= new BST();
         int nodes [] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         BST tr= new BST();
         Nodes root=tr.CREATINGBST(nodes);
        // preorder( tr.BUILDTREE(nodes));
         System.out.println(Height(root));
         System.out.println(DiameterBSt(root));
     
         
     }
    
}


