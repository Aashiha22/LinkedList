/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) 
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
        Node nod = head;
        while(nod.next != null)
        {
            nod = nod.next;
        }
        nod.next = newe;
    }
 
    return head;
}
