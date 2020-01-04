package Main;

import java.util.LinkedList;

public class LinkedListSample {

	public class Node{
		Node next;
		int data;
		
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		
		public Node(int newData) {
			this.data = newData;
			this.next = null;
		}
		public Node(Node newNext, int newData) {
			
			this.next = newNext;
			this.data = newData;
		}
	}
	
	Node head;
	int count;
	public LinkedListSample() {
		head= null;
		count =0;
	}
	
	public LinkedListSample(Node head, int count) {
		head= head;
		count =1;
	}
	
	public void add(int newData) {
		Node temp = new Node(newData);
		Node current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	public int get(int index) {
		if(index <= 0) {
			return -1;
		}
		Node current =  head;
		for(int i =1; i<index;i++) {
			current = current.getNext();
		}
		return current.getData();
	}
	
	public int size() {
		return count;
	}
	
	public boolean empty() {
		return head == null;
	}
	
	public void remove() {
		Node current = head;
		
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
	
	public static void main(String[] args) {
		
LinkedList<String> linkdList = new LinkedList<String>();


	}

}
