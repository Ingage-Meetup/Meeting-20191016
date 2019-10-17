package ListPackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	void addHeadSucceedsInAddingNodeToEmptyList() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.AddHead(5);
		assertEquals(5, list.head.data, "Expected 5 accessing from head");
		assertEquals(5, list.tail.data, "Expected 5 accessing from tail");
	}
	
	@Test
	void addTailSucceedsInAddingNodeToEmptyList() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.AddTail(5);
		assertEquals(list.head.data, 5, "Expected 5 accessing from head");
		assertEquals(list.tail.data, 5, "Expected 5 accessing from tail");
	}
	
	@Test
	void addHeadSucceedsInAddingNodeToNonEmptyList() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.AddHead(5);
		list.AddHead(6);
		assertEquals(list.head.data, 6, "Expected 5 accessing from head");
		assertEquals(list.tail.data, 5, "Expected 5 accessing from tail");
	}
	
	@Test
	void addTailSucceedsInAddingNodeToNonEmptyList() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.AddTail(5);
		list.AddTail(6);
		assertEquals(list.head.data, 5, "Expected 5 accessing from head");
		assertEquals(list.tail.data, 6, "Expected 5 accessing from tail");
	}
	
	@Test
	void numberOfElementsReturnZeroForEmptyList() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		int count = list.NumberOfElements();
		assertEquals(0, count, "Expected 0 elements in empty list");
	}
	
	@Test
	void numberOfElementsReturnOneForListWithOneElement() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.AddTail(5);
		int count = list.NumberOfElements();
		assertEquals(1, count, "Expected 1 element in list containing 1 element");
	}
	
	@Test
	void numberOfElementsReturnSixForListWithSixElements() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.AddTail(5);
		list.AddTail(6);
		list.AddTail(5);
		list.AddTail(6);
		list.AddTail(5);
		list.AddTail(6);
		list.PrintList();
		int count = list.NumberOfElements();
		assertEquals(6, count, "Expected 6 elements in list with 6 elements");
	}
	

}
