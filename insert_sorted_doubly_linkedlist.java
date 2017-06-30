 else
    {
        Node curr = head.next;
        Node prev = curr;
       /*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) 
{
    Node newe = new Node();
    newe.data = data;
    newe.prev = newe.next = null;
    
    if(head.next == null)
    {
        head.next = newe;
        newe.prev = head;
    }
    else
    {
        Node curr = head.next;
        Node prev = new Node();
        prev = null;
        while((curr != null) && (curr.data < data))
        {
            prev = curr;
            curr = curr.next;
        }
        if(curr == null)
        {
            prev.next = newe;
            newe.prev = prev;
        }
        else if(prev == null)
        {
            newe.next = curr;
            curr.prev = newe;           // do with curr ptr without prev
            head.next = newe;
        }
        else
        {
            newe.next = curr;
            newe.prev = prev;
            prev.next = newe;
            curr.prev = newe;
        }   
    }
    Node node3 = head.next;
    while(node3 != null)
    {
        node3 = node3.next;
    }
    return head;
}
