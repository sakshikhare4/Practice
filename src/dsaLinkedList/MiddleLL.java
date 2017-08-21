package dsaLinkedList;

public class MiddleLL {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}

	}

	public void push(int data) {
		Node n1 = new Node(data);
		n1.next = head;
		head = n1;
	}

	public void middleElement() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
		}

		System.out.println(slow_ptr.data);
	}
	void printList() {
		Node tnode=head;
		while(tnode!=null) {
			System.out.print(tnode.data+" -> ");
			tnode=tnode.next;
	
		}
		System.out.println("NULL");
	}
	public static void main(String[] args) {
		MiddleLL l1 = new MiddleLL();
		for (int i = 5; i > 0; i--) {
			l1.push(i);
		}
			l1.printList();
			l1.middleElement();

	}

}
