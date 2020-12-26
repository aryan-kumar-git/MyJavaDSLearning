package dataStructures.listDS;

public class ImplementingLinkedList {
	
	Node Head;
	
	void Add(int data) {
		
		Node toAdd = new Node(data);
		
		Node temp = Head;
		
		if(Head == null) {
			Head = toAdd;
			return;
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
	}
	
	void Print() {
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
