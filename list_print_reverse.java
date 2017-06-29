/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) 
{
    if(head == null) 
    {
        System.out.print("");
    }
    else
    {
        print(head);
    }
}

void print(Node head)
{
    if(head != null)
    {
        print(head.next);
        System.out.println(head.data);
    }
}
