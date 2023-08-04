class Node {
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value=value;
    }
}
class Tree{
    Node left=null;
    Node right=null;
    int len;
   public static Node root=null;
    Tree(int value){
        Node newnode=new Node(value);
        left=null;
        right=null;
        root=newnode;
        len=1;
    }
   void insertLeft(Node root,Node v){
        //Node newnode=new Node(v);
        if(root==null){
            left=null;
            right=null;
            root=v;
        }
        else {
            root.left=v;
        }
   }
    void insertRight(Node root,Node v){
        //Node newnode=new Node(v);
        if(root==null){
            left=null;
            right=null;
            root=v;
        }
        else {
            root.right=v;
        }
    }


    public static void main(String[] args) {
        Tree tree =new Tree(7);
       Node newnode1 =new Node(5);
        Node newnode2 =new Node(6);
        tree.insertLeft(root,newnode1);
        tree.insertRight(root,newnode2);
        Node newnode3 =new Node(3);
        Node newnode4 =new Node(2);
        tree.insertLeft(root.left,newnode3);
        tree.insertRight(root.left,newnode4);
       System.out.println(tree.root.left.right.value);


    }
}