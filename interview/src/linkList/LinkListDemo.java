package linkList;

public class LinkListDemo {
	static Node head;
	
	public static Node addHead(int data) {
		Node new_list=new Node(data);
		new_list.next=head;
		head=new_list;
		return head;
	}
	
	
	public static Node add(int data) {
		if(head==null) {
			Node new_node=new Node(data);
			head=new_node;
			return head;
		}
		else {
			Node new_node=new Node(data);
			Node currunt_node = head;
			while(currunt_node.next!=null) {
				currunt_node=currunt_node.next;
			}
			currunt_node.next=new_node;
			
		}
		
		return head;
		}
	
	public static void display() {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static Node insertNode(int data, int position) {
		
		if(position==0) {
			Node new_node=new Node(data);
			new_node.next=head;
			return head=new_node;
		}
		int currunt_position=1;
		Node new_node=new Node(data);
		Node currurnt_node=head;
		while(currunt_position<position&& currurnt_node!=null) {
			currunt_position++;
			currurnt_node=currurnt_node.next;
		}
		new_node.next=currurnt_node.next;
		currurnt_node.next=new_node;
		return head;
	}
	
	
	public static Node deleteNode(int position) {
		if(position==0) {
			return head.next;
		}
		int currunt_postion=1;
		Node currunt_node=head;
		
		while(currunt_postion<position) {
			currunt_postion++;
			currunt_node=currunt_node.next;
		}
		currunt_node.next=currunt_node.next.next;
		return head;
		
	}
	public static  Node reversList(Node head) {
		if(head==null) {
			return head;
		}
		
		reversList(head.next);
		System.out.println(head.data);
		return head;
	}
	
	public static void main(String[] args) {
		
		add(1);
		add(2);
		add(3);
		addHead(0);
		insertNode(5, 2);
		insertNode(-1, 0);
		
		//deleteNode(3);
		//display();
		reversList(head);
		
		
		
		
	}

}
