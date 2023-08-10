public class CircularLinkedList
{
	public static void main(String[] args) {
	    CircularLinkedList list=new CircularLinkedList();
	    list.insertAtFirst(1);
	    list.insertAtFirst(2);
	    list.insertAtFirst(3);
	    list.deleteAtEnd();
	    list.deleteBeg();
	    list.insertAtEnd(3);
	    list.display();
	    
	}
	public class Node{
	    int data;
	    Node next;
	    Node(int val){
	        data=val;
	        next=null;
	    }
	}
	Node last;
	CircularLinkedList(){
	    last=null;
	}
	public void insertAtFirst(int val){
	    Node newNode=new Node(val);
	    if(last==null){
	        last=newNode;
	        last.next=last;
	    }
	    else{
	        newNode.next=last.next;
	        last.next=newNode;
	        last=newNode;
	    }
	}
    public void display() {
    if (last == null) {
        System.out.println("List is empty.");
        return;
    }

    Node temp = last.next;
    do {
        System.out.print(temp.data + " ");
        temp = temp.next;
    } while (temp != last.next);
    System.out.println();
}

	public void deleteBeg(){
	    last.next=last.next.next;
	}
	public void deleteAtEnd(){
	    Node temp=last;
	    temp=last.next;
	    while(temp.next!=last){
	        temp=temp.next;
	    }
	    temp.next=last.next;
	    last=temp;
	}
	public void insertAtEnd(int val){
	    Node newNode=new Node(val);
	    newNode.next=last.next;
	    last.next=newNode;
	    last=newNode;
	}
	
}
