/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node merge(Node headA, Node headB)
{
    Node nodeA = headA;
    Node nodeB = headB;
    Node head = new Node();
    head.next = null;
    
    if(nodeB == null)
    {
        return nodeA;
    }
    else if(nodeA == null)
    {
        return nodeB;
    }
    while((nodeA.next != null) || (nodeB.next != null))
    {
        if(nodeA.data < nodeB.data)
        {
            insert(head, nodeA.data);
            nodeA = nodeA.next;
        }
        else if(nodeA.data > nodeB.data)
        {
            insert(head, nodeB.data);
            nodeB = nodeB.next;
        }
    }
    while(nodeA.next != null)
    {
        insert(head, nodeA.data);
        nodeA = nodeA.next;
    }
    while(nodeB.next != null)
    {
        insert(head, nodeB.data);
        nodeB = nodeB.next;
    }
    if(nodeA.data < nodeB.data)
    {
        insert(head, nodeA.data);
        insert(head, nodeB.data);
    }
    else
    {
        insert(head, nodeB.data);
        insert(head, nodeA.data);   
    }
    return head.next;
}

void insert(Node head, int data)
{
    Node newe = new Node();
    newe.data = data;
    newe.next = null;
    
    if(head.next == null)
    {
        head.next = newe;
    }
    else
    {
        Node node = head;
        while(node.next != null)
        {
            node = node.next;
        }
        node.next = newe;
    }
} 

Node MergeLists(Node headA, Node headB) 
{
    Node node = new Node();
    node = merge(headA,headB);
    return node;
}
