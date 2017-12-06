package com.linkedreverse.linkedadd;

import java.util.Stack;

public class Node {
	private int value;
	private Node next;
	
	public Node(int value) {
		this.value = value;
		next = null;
	}
	
	
	
	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public Node getNext() {
		return next;
	}



	public void setNext(Node next) {
		this.next = next;
	}



	/**
	 * 链表相加
	 * @param head1
	 * @param head2
	 * @return
	 */
	public static Node add (Node head1, Node head2) {
		Node sum = new Node(0);
		Node tail = sum;
		Node n1 = head1.next;
		Node n2 = head2.next;
		
		Node cur;
		int carry = 0;
		int value;
		while (n1!=null && n2!= null) {
			value = n1.value + n2.value + carry;
			carry = value / 10;
			value = value % 10;
			cur = new Node(value);
			tail.next = cur;
			tail = cur;
			
			n1 = n1.next;
			n2 = n2.next;
		}
		
		Node n = ((n1 == null) ? n2 : n1);
		
		while (n != null) {
			value = n.value + carry;
			carry = value / 10;
			value = value % 10;
			cur = new Node(value);
			tail.next = cur;
			tail = cur;
			n = n.next;
		}
		
		if (carry != 0) {
			tail.next = new Node(carry);
		}
		
		return sum;
	}

	
	/**
	 * 链表翻转
	 * @param head
	 * @param from
	 * @param to
	 */
	public static void reverse(Node head, int from, int to) {
		Node cur = head.next;
		int i;
		for (i = 0; i < from -1 ; i++) {
			head = cur;
			cur = cur.next;
		}
		
		Node pre = cur;
		cur = cur.next;
		Node next;
		to--;
		
		for(; i < to ; i++) {
			next = cur.next;
			cur.next = head.next;
			head.next = cur;
			pre.next = next;
			cur = next;
		}
		
	}
	
	/**
	 * 去除重复链表，只保留第一次出现的数据
	 * @param head
	 */
	public static void deleteDuplicateNode(Node head) {
		Node pre = head.next;
		Node cur = null;
		while (pre != null) {
			cur = pre.next;
			if (cur != null && (cur.value == pre.value)) {
				pre.next = cur.next;
				cur = null;
			}
			else {
				pre = cur;
			}
			
			
		}
	}
	
	public static void printNodeList(Node node) {
		Node cur = node.getNext();
		while (cur != null) {
			if (cur.getNext() != null){
				System.out.print(cur.value+"->");
			} else {
				System.out.print(cur.value);
			}
			
			cur  = cur.next;
		}
		System.out.println();
	}
	
	public static Node factorial(int value) {
		Node sum = new Node(0);
		
		return sum;
	}
	
	public static Node bulidNode (int base) {
		Node head = new Node(0);
		Node cur = head;
		while (base / 10 > 0) {
			int value = base % 10;
			Node node = new Node(value);
			cur.next = node;
			cur = node;
			base = base / 10 ;
		}
		int value = base % 10;
		Node node = new Node(value);
		cur.next = node;
		cur = node;
		return head;
	}
	


}
