public class middle{
    Node next;
    Node head;
    int data;
    public middle(int data){
        this.data=data;
        next=null;
    }
}
class Solution
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            // this pointer moves 1 nodes ahead everytime loop is run
            
            fast = fast.next.next;
            // this pointer moves 2 nodes ahead everytime loop is run
        }
        
        return slow.data;
        // since slow was moving with half speed, it is there at halfway point
   }
}