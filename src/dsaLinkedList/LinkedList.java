package dsaLinkedList;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

	}

	void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	void middleElement() {
		Node fast_ptr = head;
		Node slow_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
		}
		System.out.println("Middle Element " + slow_ptr.data);
	}

	void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		System.out.println("NULL");

	}
	
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		for(int i=5;i>0;i--) {
			list.push(i);
		}

		list.printList();
		list.middleElement();
	}

}
