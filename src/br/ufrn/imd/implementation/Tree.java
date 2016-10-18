package br.ufrn.imd.implementation;

import br.ufrn.imd.interfaces.TreeInterface;

/**
 * 
 * Class that represents the binary search tree
 * 
 * @author Pedro Paulo Paiva de Medeiros
 *
 */
public class Tree implements TreeInterface {
	/**
	 * The tree root node
	 */
	private Node root;

	/**
	 * The size of the tree
	 * This value starts with 1 because every tree has at least one node, which is the root one
	 */
	private int size = 1;

	/**
	 * Empty constructor
	 */
	public Tree() {
		super();
	}

	/**
	 * 
	 * Constructor of the tree setting the Root node
	 * 
	 * @param root
	 * 			  the root to set
	 */
	public Tree(Node root) {
		super();
		this.root = root;
	}

	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * @param root
	 *            the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Insert a new value on the Tree
	 * 
	 * @param value
	 *            the value to insert in the tree
	 * 
	 * @see br.ufrn.imd.interfaces.TreeInterface#add(java.lang.Object)
	 */
	@Override
	public void insert(Double value) {
		Node actualNode = this.root;
		
		boolean finded = false;
		//search for the node where the new value should be inserted
		do {
			if (value == actualNode.getValue()) {
				finded = true;
			} else if (actualNode.smallerThan(value)) {
				if(actualNode.getRight() != null){
					actualNode = actualNode.getRight();
				} else {
					finded = true;
				}
			} else if (actualNode.greaterThan(value)) {
				if(actualNode.getLeft() != null){
					actualNode = actualNode.getLeft();
				} else {
					finded = true;
				}
			}
		}while(!finded);
		
		//insert the new node
		if(value == actualNode.getValue()){
			actualNode.incrementCount();
		} else if (actualNode.smallerThan(value)) {
			actualNode.setRight(new Node(value));
		} else if (actualNode.greaterThan(value)) {
			actualNode.setLeft(new Node(value));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.ufrn.imd.interfaces.TreeInterface#remove(java.lang.Object)
	 */
	@Override
	public void delete(Double element) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.ufrn.imd.interfaces.TreeInterface#search(java.lang.Object)
	 */
	@Override
	public Double search(Double value) {
		
		Node actualNode = this.root;
		
		boolean finded = false;
		//search for the node where the new value should be inserted
		do {
			if (value == actualNode.getValue()) {
				finded = true;
				return actualNode.getValue();
			} else if (actualNode.smallerThan(value)) {
				if(actualNode.getRight() != null){
					actualNode = actualNode.getRight();
				} else {
					finded = true;
				}
			} else if (actualNode.greaterThan(value)) {
				if(actualNode.getLeft() != null){
					actualNode = actualNode.getLeft();
				} else {
					finded = true;
				}
			}
		}while(!finded);
		
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.ufrn.imd.interfaces.TreeInterface#isBST()
	 */
	@Override
	public boolean isBST() {
		// TODO Auto-generated method stub
		return false;
	}

}
