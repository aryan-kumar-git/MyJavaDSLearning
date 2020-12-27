package dataStructures.listDS;

public class ImplementingLinkedList<E> {
	
	Node<E> Head;
	
	void Add(E data) {
		
		Node<E> toAdd = new Node<>(data);
		
		Node<E> temp = Head;
		
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
		Node<E> temp = Head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	static class Node<E>{
		Node<E> next;
		E data;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

}
