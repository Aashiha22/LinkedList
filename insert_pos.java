/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) 
{
    Node newe = new Node();
    newe.data = data;
    newe.next = null;
    if(head == null)
    {
        head = newe;
    }
    else
    {
        Node curr = head;
        int i=1;
        if(position == 0)
        {
            newe.next = head;
            head = newe;
        }
        else
        {
            while(i<position-1)
            {
                curr = curr.next;
                i++;
            }
            if(curr.next == null)
            {
                curr.next = newe;
            }
            else
            {
                newe.next = curr.next;
                curr.next = newe;
            }
            
        }
    }
    return head;
}
