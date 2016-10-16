package br.ufrn.imd.implementation;

import br.ufrn.imd.interfaces.TreeInterface;

/**
 * 
 * Class that represents the binary search tree
 * 
 * @author Pedro Paulo Paiva de Medeiros
 *
 */
public class Tree<T> implements TreeInterface<T> {
	/**
	 * The tree root node
	 */
	private Node<T> root;

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
	 */
	public Tree(Node<T> root) {
		super();
		this.root = root;
	}

	/**
	 * @return the root
	 */
	public Node<T> getRoot() {
		return root;
	}

	/**
	 * @param root
	 *            the root to set
	 */
	public void setRoot(Node<T> root) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.ufrn.imd.interfaces.TreeInterface#add(java.lang.Object)
	 */
	@Override
	public void insert(T element) {
		Node<T> actualNode = this.root;
		
		boolean inserted = false;
		
		do {
			if (element == actualNode.getValue()) {
				actualNode.incrementCount();
				inserted = true;
			} else if (actualNode.smallerThan(element))) {
				actualNode = actualNode.getRight();
			} else if (actualNode.greaterThan(element)) {
				actualNode = actualNode.getLeft();
			}
		}while(actualNode.getLeft() != null && actualNode.getRight() != null && !inserted);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.ufrn.imd.interfaces.TreeInterface#remove(java.lang.Object)
	 */
	@Override
	public void delete(T element) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.ufrn.imd.interfaces.TreeInterface#search(java.lang.Object)
	 */
	@Override
	public T search(T value) {
		// TODO Auto-generated method stub
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
