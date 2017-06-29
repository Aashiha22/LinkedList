/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) 
{
     Node curr = head;
     Node nxt = new Node();
     int i=0;
     while(curr != null)
     {
         if(i == n)
         {
             nxt = head;
         }
         curr = curr.next;
         if(i > n)
         {
             nxt = nxt.next;
         }
         i++;
    }
    return nxt.data;
}
