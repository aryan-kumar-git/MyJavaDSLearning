package dataStructures.listDS;

public class ImplementingLinkedList {
	
	Node Head;
	
	void add(int data) {
		
		Node toAdd = new Node(data);
		
		if(Head == null) {
			Head = toAdd;
			return;
		}
		
		Node temp = Head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
		
	}
	
	void print() {
		Node temp = Head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	static class Node{
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
}
