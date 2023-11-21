public class BST{
    public  static void main(String[] args){

    }

}
class Node{
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    int data;
    Node left;
    Node right;
}
class Tree{
    Node root;

    Boolean isEmpty(){
        return root == null;
    }
}
void insert(Node newNode){
    if(isEmpty()){
        root = newNode;
        return;
    
    }
}

void insertRec(Node currentNode, Node newNode){
    if(currentNode == null){
        currentNode = newNode;
        return;
    }

}
if(newNode.data < currentNode.data){
    insertRec(currentNode.left, newNode)
}