//codigo para hacer inorder 
class Node{
    Node left, rigth;
    int data;
    public Node(int data){
        this.data=data; 
    }
    public void insert(int value){
        if(value<=data){
            if(left==null){
                left=new Node(value);
            }
            else{
                left.insert(value);
            }
        }else{
            if(rigth==null){
                rigth=new Node(value);
            }else{
                rigth.insert(value);
            }
        }
    }
    public boolean contains(int value){
        if(value==data){
            return true;
        }else if(value<data){
            if(left==null){
            return false;
        }else{
            return left.contains(value);
        }
        }else{
        if(rigth==null){
            return false;
        }else{
            return rigth.contains(value);
        }
        }
    }
}

public void printInOrder(){
    if(left!=null){
    left.printInOrder();
    }
    System.out.println(data);

    if(rigth!=null){
    rigth.printInOrder();
    }
}