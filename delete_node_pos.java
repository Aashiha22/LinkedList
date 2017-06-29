/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) 
{
    if(head == null)
    {
        return head;
    }
    else
    {
        if(position == 0)
        {
            head = head.next;
        }
        else
        {
            Node curr = new Node();
            Node prev = new Node();
            curr = head;
            int i=0;
            while(i < position)
            {
                prev = curr;
                curr = curr.next;
                i = i + 1;
            }
            if(curr.next == null)
            {
                prev.next = null;
            }
            else
            {
                prev.next = curr.next;
            }
        }
    }
    return head;
}

