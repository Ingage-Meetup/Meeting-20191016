package ListPackage;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
	Node<T> head;
	Node<T> tail;
	
	public MyLinkedList() {
		head = tail = null;
	}
	
	public static  void main(String[] arr) {
		
		// List of integers
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		intList.AddHead(1);
		intList.AddHead(2);
		intList.AddTail(3);
		intList.AddHead(4);		
		intList.AddHead(5);
		intList.AddHead(6);		
		intList.AddTail(7);
		intList.AddHead(8);		
		intList.AddTail(9);
		intList.AddHead(10);
		
		for (Integer i: intList) {
			System.out.println(i);
		}
		
		// List of strings
		MyLinkedList<String> strList = new MyLinkedList<String>();
		strList.AddHead("Thing 1");
		strList.AddHead("Thing 2");
		strList.AddTail("Something borrowed");
		strList.AddHead("Something blue");		
		strList.AddHead("Harry Potter");
		strList.AddHead("Wears a tutu");		
		strList.AddTail("Where's my posse?");
		strList.AddHead("Where's my crew?");		
		strList.AddTail("Hallelujah");
		strList.AddHead("Hallelu");
		
		for (String s: strList) {
			System.out.println(s);
		}
		
	}
	
	public void AddHead(T data) {
		Node<T> newNode = new Node<T>(data);
		AddHead(newNode);
	}
	
	public void AddHead(Node<T> n) {
		if (head == null) {
			head = n;
			tail = n;
		} else {
			n.next = head;
			head = n;
		}
	}
	
	public void AddTail(T data) {
		Node<T> newNode = new Node<T>(data);
		AddTail(newNode);
	}
	
	public void AddTail(Node<T> n) {
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
	}
	
	public int NumberOfElements() {
		int count = 0;
		Node<T> temp = head;
		if (temp != null) {
			++count;
			while (temp.next != null) {
				++count;
				temp = temp.next;
			};
		}
		return count;
	}
	
	public void PrintList() {
		Node<T> temp = head;
		if (temp != null) {
			while (temp.next != null)  {
				System.out.print(temp.data);
				System.out.print(' ');
				temp = temp.next;
			};
			System.out.println();
		}
	}
	
	// Implement Iterable interface methods

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyLinkedListIterator<T>(this);
	}
	
	
	// Internal classes	
	
	public class Node<T> {
		T data;
		Node<T> next;
		
		public Node(T d) {
			data = d;
			next = null;
		}
	}
	
	public class MyLinkedListIterator<T> implements Iterator<T> {
		
		private MyLinkedList<T> myList;
		private MyLinkedList<T>.Node<T> current;
		
		public MyLinkedListIterator(MyLinkedList<T> list) {
			myList = list;
			current = myList.head;
		}

		public void addToBack(T data) {
			myList.AddTail(data);
		}
		
		public void addToFront(T data) {
			myList.AddHead(data);		
		}
		
		public int search(String stringToFind) {
			return -1;
		}
		
		// Implement Iterator interface methods
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
	        T data = current.data; 
	        current = current.next; 
	        return data; 
		}
		
	}
	

}


