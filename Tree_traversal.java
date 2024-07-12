class node{
    int data;
    node lc;
    node rc;
    node(int value){
        this.data=value;
        this.lc=null;
        this.rc=null;

    }
}
class binaryTree{
    node root;
    binaryTree(){
        this.root=null;}
    void insertion (node r,int value){
        if (this.root==null){
            this.root=new node(value);
            return;
        }


         if (value>r.data) {
             if (r.rc != null)
                 insertion(r.rc, value);
             else {
                 r.rc = new node(value);
             }
         }
        else{
            if (r.lc!=null)
                insertion(r.lc,value);
            else
                r.lc=new node(value);
        }

    }
    void preorder(node r)
    {  if (r==null)
        return ;
        System.out.println(r.data+"->");
        preorder(r.lc);
        preorder(r.rc);
    }
    void postorder(node r)
    {   if (r==null)
        return ;
        postorder(r.lc);
        postorder(r.rc);
        System.out.println(r.data+"->");
    }
     void inorder(node r)
     {
       if (r==null){
           return ;
       }
       inorder(r.lc);
       System.out.print(r.data+"->");
       inorder(r.rc);
    }
    void search(int key)
    {

    }
}


public class Tree_traversal {
    public static void main(String[] args)
    {
        binaryTree tree1=new binaryTree();

        tree1.insertion(tree1.root,50);
        //System.out.println(tree1.root.data);
        tree1.insertion(tree1.root,40);
        tree1.insertion(tree1.root,30);
        tree1.insertion(tree1.root,60);
        tree1.insertion(tree1.root,55);
        tree1.insertion(tree1.root,45);
        tree1.insertion(tree1.root,25);
        tree1.insertion(tree1.root,58);
        tree1.inorder(tree1.root);




    }
}