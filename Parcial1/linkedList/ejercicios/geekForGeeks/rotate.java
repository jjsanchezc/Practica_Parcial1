/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    
    public Node rotate(Node head, int k) {
        if(head==null){
            return null;
        }
        Node anterior=head;//el elemento que retornará null
        Node ultimo=head;
        int contador=0;
        while(contador<k-1){
            anterior=anterior.next;
            contador++;
        }
        while(ultimo.next!=null){
            ultimo=ultimo.next;
        }
        ultimo.next=head;
        head=anterior.next;
        anterior.next=null;
        return head;
    }
}