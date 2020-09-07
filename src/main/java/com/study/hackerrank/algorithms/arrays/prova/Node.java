package com.study.hackerrank.algorithms.arrays.prova;

public class Node {

	// keep these​​​​​​‌​​​‌​​​‌​​​​‌‌​​‌​‌​‌​‌​ fields
	Node left, right;
	int value;

	Node(int value) {
		this.value = value;
		right = null;
		left = null;
	}

	public Node find(int v) {
		if (v > this.value && this.right != null)
			return right.find(v);
		if (v < this.value && this.left != null)
			return left.find(v);
		if (this.value == v)
			return this;
		return null;
	}
	
	public static void main(String[] args) {
		Node n = new Node(8);
		System.out.println(n.find(8).value);
	}

}
