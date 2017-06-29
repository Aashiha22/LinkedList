/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) 
{
    int val = 1;
    if(headA == null && headB == null)
    {
        val = 1;
    }
    else if(headA != null && headB == null)
    {
        val = 0;
    }
    else if(headA == null && headB != null)
    {
        val = 0;
    }
    Node nodeA = headA;
    Node nodeB = headB;
    while((nodeA != null)&&(nodeB != null))
    {
        if(nodeA.data != nodeB.data)
        {
            val = 0;
        }
        nodeA = nodeA.next;
        nodeB = nodeB.next;
    }
    if(nodeB != null)
    {
        val = 0;
    }
    return val;
}
        
