/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) 
{
    Node newe = new Node();
    newe.data = x;
    newe.next = null;
    if(head == null)
    {
        head = newe;
    }    
    else
    {
        newe.next = head;
        head = newe;
    }
    return head;
}
