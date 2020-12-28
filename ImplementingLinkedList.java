package dataStructures.listDS;

public class ImplementingLinkedList<E> {
	
	Node<E> Head;
	
	public void add(E data) {
		
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
	
	public E removeLast() throws Exception {
		
		Node<E> temp = Head;
		
		if(temp == null) {
			throw new Exception("Can not remove last element from empty linked list");
		}
		
		if(temp.next == null) {
			Node<E> toRemove = Head;
			Head = null;
			return (E) toRemove.data;
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		
		Node<E> toRemove = temp.next;
		temp.next = null;
		return (E) toRemove.data;
	}
	
	public E getLast() throws Exception {
		
		Node<E> temp = Head;
		
		if(temp == null) {
			throw new Exception("Can not peek last element from empty linked list");
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		return (E) temp.data;
	}
	
	void print() {
		Node<E> temp = Head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public boolean isEmpty() {
		return Head == null;
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
