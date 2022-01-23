package first2A;

public class DLL

{

Node head; 
class Node

{

int data;

Node prev;
Node next;
Node(int d)

   { 
	data=d;
   }

}

public void push(int new_data)

{

Node newNode = new Node(new_data);
newNode.next = head;
newNode.prev= null; 
if (head != null)
head.prev= newNode;
head=newNode;
} 
public void InsertAfter(Node prev_Node, int new_data)

{

if (prev_Node == null)
{
System.out.println("The given previous node cannot be NULL ");

return;
}
Node newnode = new Node(new_data);

newnode.next = prev_Node.next; 
prev_Node.next = newnode;
newnode.prev= prev_Node;

if (newnode.next != null)
	newnode.next.prev= newnode;

void append(int new_data)

{

Node new_node = new Node(new_data);
Node last= head;

new_node.next = null;

if (head == null)

{

new_node.prev = null;

head= new_node;

return;
 } 
while (last.next != null)

last = last.next;

last.next = new_node;
new_node.prev = last;

}

public void printlist(Node node)

{

Node last = null;

System.out.println("Traversal in forward Direction");

while (node != null)
{
System.out.print(node.data + " ");

last = node; 
node =node.next;

}

System.out.println();

System.out.println("Traversal in reverse direction");
while (last != null) {

System.out.print(last.data + " ");
last = last.prev;
}
}
public static void main(String[] args) {

DLL dll = new DLL;

dll.append(6);
dll.push(7);
dll.append(4);
dll.push(1);
dll.InsertAfter(dll.head.next,8);
System.out.println("created DLL is :");
dll.printlist(dll.head));
}}
