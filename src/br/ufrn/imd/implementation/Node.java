package br.ufrn.imd.implementation;

import br.ufrn.imd.interfaces.NodeInterface;

/**
 * 
 * Class that represents the node of the tree
 * 
 * @author Pedro Paulo Paiva de Medeiros
 *
 */
public class Node<T> implements NodeInterface{
	/**
	 * Using the generic type to represent the value of this node
	 */
	private T value;

	/**
	 * The left node of this node
	 */
	private Node<T> left;

	/**
	 * The right node of this node
	 */
	private Node<T> right;
	
	/**
	 * The counter of this node, representing how many times this node with this value was added to the tree
	 * This starts with 1 because every node was added at least one time at the tree
	 */
	private int count = 1;

	/**
	 * Empty constructor
	 */
	public Node() {
		super();
	}

	/**
	 * 
	 * Constructor of the node. This constructor only receives the value of the
	 * node, seting the left and right to null
	 * 
	 * @param value
	 *            the value of the node
	 */
	public Node(T value) {
		super();
		this.value = value;
		this.left = null;
		this.right = null;
	}

	/**
	 * 
	 * Constructor of the node. This constructor receives all values, for the
	 * case to insert some node in the tree
	 * 
	 * @param value
	 *            the value of the node
	 * @param left
	 *            the left to set
	 * @param right
	 *            the right to set
	 */
	public Node(T value, Node<T> left, Node<T> right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * @return the left
	 */
	public Node<T> getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(Node<T> left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node<T> getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(Node<T> right) {
		this.right = right;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	/**
	 * Method to increment the counter of this node
	 */
	public void incrementCount() {
		this.count++;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Node))
			return false;
		Node<?> other = (Node<?>) obj;
		if (count != other.count)
			return false;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
}
