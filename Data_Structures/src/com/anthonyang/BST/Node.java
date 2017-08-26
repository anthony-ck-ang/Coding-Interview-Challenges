package com.anthonyang.BST;

public class Node {

	/*
	 * Binary Tree Structure
	 * 
	 * Rules 
	 * 1. all left nodes are always < all right nodes 
	 * 2. all left nodes are always < root node
	 * 3. all right nodes are always > root node or the previous node
	 * 
	 * Note: 
	 * Starting from the root node,
	 * each node or subsequent nested node can have either or, or both left and right nodes
	 * 
	 * Inserts should always be assumed as *Balanced *Balanced -> No of left
	 * nodes == No of right nodes
	 * 
	 * Insert -> O(log n) Find -> O(log n)
	 * 
	 * O(log n) Don't need to check every node to find the right one Simply
	 * divide-and-conquer by looking based on if the value is > || < root value
	 */

	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}

	public void insertValue(int value) {
		if (value <= data) { // data == root data, point to left *<-
			if (left == null) {
				left = new Node(value); // create new Node obj -> call Node
										// constructor -> set data
			} else {
				left.insertValue(value); // recursively call itself again
			}
		} else { // value >= data ->* point right
			if (right == null) {
				right = new Node(value);
			} else {
				right.insertValue(value);
			}
		}
	}

	/*
	 * Note:
	 * If containsValue methods expects a boolean return type,
	 * the return value is only return to the last method call
	 * and not to the main (first) call
	 * 
	 * 1st containsValue() -> 2nd containsValue()  -> 3rd containsValue()  [found & return to 2nd]
	 * 					      2nd(return value) <-
	 * 						  return default value <-
	 */
	public void containsValue(int value) {
		if (value == data) {
			System.out.println("True!");
		}
		if (value < data) { // point left *<-
			if (left == null) { // null pointer exception check
				System.out.println("False!");
			} else {
				left.containsValue(value); // recursively call itself
			}
		}
		if (value > data) { // value > data, points right ->*
			if (right == null) {
				System.out.println("False!");
			} else {
				right.containsValue(value); // recursively call itself
			}
		}
	}

	// private boolean contains2(Node node, Integer value) {
	// if (node.data == value) {
	// return true;
	// }
	//
	// boolean contains = false;
	// if (node.left!=null) {
	// contains = contains(node.getLeft(), value);
	// }
	// if (!contains && node.hasRight()) {
	// contains = contains(node.getRight(), value);
	// }
	// return contains;
	// }

	public void printInOrder() {
		if (left != null) {
			left.printInOrder();
		}
		System.out.println(data);
		if (right != null) {
			right.printInOrder();
		}
	}

	public static void main(String[] args) {

		Node node = new Node(10);
		/*
		 * Node class object (root) data = 10 
		 * 	Node left = null 
		 * 	Node right = null
		 */

		node.insertValue(5);
		/*
		 * Node class object (root) data = 10 
			 * Node left = (contains a new Node)
			 * data = 5 
				 * Node left = null (until a new node object is created) 
				 * Node right = null (until a new node object is created) 
		 */

		node.insertValue(15);
		/*
		 * Node class object (root) data = 10 
			 * Node left = (contains a new Node) data = 5 
				 * Node left = null (until a new node object is created) 
				 * Node right = null (until a new node object is created) 
			 * Node right = (contains a new Node) data = 15 
				 	* Node left = null (until a new node object is created) 
				 	* Node right = null (until a new node object is created)
		 */

		node.containsValue(15);

		// node.printInOrder();

	}

}
