package com.linkedreverse.linkedadd;

import java.util.Random;

public class LinkedAddTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = new Node(0);
		int i;
		for (i=1; i < 6; i++){
			Node node = new Node(i);
			node.setNext(head1.getNext());
			head1.setNext(node);
		}
		
		Node head2 = new Node(0);
		for (i=3; i < 6; i++){
			Node node = new Node(i);
			node.setNext(head2.getNext());
			head2.setNext(node);
		}
		
		Node.printNodeList(head1);
		System.out.println();
		Node.printNodeList(head2);
		System.out.println();
		Node.printNodeList(Node.add(head1, head2));
		System.out.println();
		Node.printNodeList(Node.bulidNode(1120456));

	}

}
