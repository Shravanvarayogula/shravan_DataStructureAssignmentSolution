package com.greatlearning.assignmenttwo.main;

import com.greatlearning.dsaassignmenttwo.service.BSTNodeImplementation;
import com.greatlearning.dsaassignmenttwo.service.BSTToRightSkewedTree;


public class BuildSkewedBST {
	public static void main(String[] args) {
		BSTToRightSkewedTree tree = new BSTToRightSkewedTree();
		tree.root = new BSTNodeImplementation(50);
		tree.root.left = new BSTNodeImplementation(30);
		tree.root.right = new BSTNodeImplementation(60);
		tree.root.left.left = new BSTNodeImplementation(10);
		tree.root.right.left = new BSTNodeImplementation(55);		
		BSTNodeImplementation head  = BSTToRightSkewedTree.convertToSkewedTree(tree.root);
		BSTToRightSkewedTree.traverseRightSkewTree(head);
	}
}
