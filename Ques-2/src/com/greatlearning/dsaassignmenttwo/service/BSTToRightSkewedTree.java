package com.greatlearning.dsaassignmenttwo.service;

public  class BSTToRightSkewedTree{
	public BSTNodeImplementation root;
	static BSTNodeImplementation prevNode = null; 
	static BSTNodeImplementation headNode = null; 
	
/*
 * In order traversing the given tree from root to find out the tree minimum node and this node will be head of right skewed tree.
 * 
 */
	public static BSTNodeImplementation convertToSkewedTree(BSTNodeImplementation root){
		// Base condition
		if (root == null){
			return root;
		}
		// Recursively start with Left Subtree
		convertToSkewedTree(root.left);
		
		BSTNodeImplementation right = root.right;
		// Assigning the tree minimum as head node of skewed tree once the recursive call stack ends at tree minimum
		if (headNode == null){
			headNode = root;
			root.left = null;
			prevNode = root;

		}
		else {
			//Assigning the current root of the tree as previous node
			prevNode.right= root;
			root.left = null;
			prevNode = root;	

		}
		// Recursively start with Left Subtree
		convertToSkewedTree(right);
		// Returning the Head node to the function call 
		return headNode;
	}
	//In order Traversal function to traverse the Skewed tree to print the Output after transforming to right skew tree
	public static void traverseRightSkewTree(BSTNodeImplementation root){
		if (root == null){
			return;
		}
		else {
			System.out.print(root.val + " ");
			traverseRightSkewTree(root.right);
		}
	}
}
