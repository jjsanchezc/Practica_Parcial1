class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseListIterativo(Node head)//tiempo(O(n)), Espacio(O(1))
    {
        if(head == null)
            return null;
        
        Node prev = null;   
        Node curr = head;
        Node next = null;
        
        while(curr != null)
        {
            next = curr.next;   // Take the next node as ahead
            curr.next = prev;    // Link current node to its previous
            prev = curr;         // update prev as the current node
            curr = next;        // update tmp
        }
        
        return prev;
    }
}