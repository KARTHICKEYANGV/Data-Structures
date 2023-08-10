public class DoublyLinkedList
{
	public static void main(String[] args) {
	    DoublyLinkedList list=new DoublyLinkedList();
	    list.insertAtFirst(3);
	    list.insertAtFirst(3);
	    list.insertAtFirst(3);
	    list.insertAtFirst(3);
	    list.insertAtpos(2,2);
	    list.deleteAtpos(2);
	    list.display();
	}
	public class Node{
	    int data;
	    Node next;
	    Node prev;
	    Node(int val){
	        data=val;
	        next=null;
	        prev=null;
	    }
	}
	    Node head;
	    Node tail;
	    DoublyLinkedList(){
	        Node head=null;
	        Node tail=null;
	    }
	    public void insertAtFirst(int val){
	        Node newNode=new Node(3);
	        if(head==null){
	            head=newNode;
	            tail=newNode;
	        }
	        else{
	            newNode.next=head;
	            head=newNode;
	        }
	    }
	    public void display(){
	        Node temp=head;
	        while(temp!=null){
	            System.out.print(temp.data+"->");
	            temp=temp.next;
	        }
	        System.out.print("Null");
	    }
	    public void insertAtpos(int val,int pos){
	        if(pos==0){
	            insertAtFirst(val);
	        }
	        Node newNode=new Node(val);
	        Node temp=head;
	        for(int i=1;i<pos;i++){
	            temp=temp.next;
	            if(temp==null){
	                System.out.print("Invalid pos");
	            }
	        }
	        temp.next.prev=temp;
	        newNode.next=temp.next;
	        temp.next=newNode;
	        newNode.prev=temp;
	    }
	    public void deleteAtpos(int pos){
	        if(pos==0){
	            head=head.next;
	        }
	        Node temp=head;
	        for(int i=1;i<pos;i++){
	            temp=temp.next;
	        }
	        temp.next.next.prev=temp;
	        temp.next=temp.next.next;
	    }
	}
