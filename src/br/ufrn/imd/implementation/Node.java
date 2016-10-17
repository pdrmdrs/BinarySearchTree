package br.ufrn.imd.implementation;

import br.ufrn.imd.interfaces.NodeInterface;

/**
 * 
 * Class that represents the node of the tree
 * 
 * @author Pedro Paulo Paiva de Medeiros
 *
 */
public class Node implements NodeInterface {
	/**
	 * Using the Double class to represent the value of this node
	 */
	private Double value;

	/**
	 * The left node of this node
	 */
	private Node left;

	/**
	 * The right node of this node
	 */
	private Node right;

	/**
	 * The counter of this node, representing how many times this node with this
	 * value was added to the tree This starts with 1 because every node was
	 * added at least one time at the tree
	 */
	private int count = 1;

	/**
	 * Empty constructor
	 */
	public Node() {
		super();
	}

	/**
	 * Constructor of the node, accepting the int as parameter of value
	 * 
	 * @param value
	 *            the value of the node
	 */
	public Node(int value) {
		super();
		this.value = new Double(value);
		this.setLeftRightNull();
	}

	/**
	 * Constructor of the node, accepting the double as parameter of value
	 * 
	 * @param value
	 *            the value of the node
	 */
	public Node(double value) {
		super();
		this.value = new Double(value);
		this.setLeftRightNull();
	}

	/**
	 * Constructor of the node, accepting the float as parameter of value
	 * 
	 * @param value
	 *            the value of the node
	 */
	public Node(float value) {
		super();
		this.value = new Double(value);
		this.setLeftRightNull();
	}

	/**
	 * Constructor of the node, accepting the long as parameter of value
	 * 
	 * @param value
	 *            the value of the node
	 */
	public Node(long value) {
		super();
		this.value = new Double(value);
		this.setLeftRightNull();
	}

	/**
	 * Constructor of the node, accepting the short as parameter of value
	 * 
	 * @param value
	 *            the value of the node
	 */
	public Node(short value) {
		super();
		this.value = new Double(value);
		this.setLeftRightNull();
	}

	/**
	 * Constructor of the node, accepting the byte as parameter of value
	 * 
	 * @param value
	 *            the value of the node
	 */
	public Node(byte value) {
		super();
		this.value = new Double(value);
		this.setLeftRightNull();
	}

	/**
	 * 
	 * Constructor of the node. This constructor only receives the value of the
	 * node, seting the left and right to null
	 * 
	 * @param value
	 *            the value of the node
	 */
	public Node(Double value) {
		super();
		this.value = value;
		this.setLeftRightNull();
	}

	/**
	 * 
	 * Constructor of the node. This constructor receives all values, for the
	 * case to insert some node in the tree and receives an int as parameter of
	 * the value
	 * 
	 * @param value
	 *            the value of the node
	 * @param left
	 *            the left to set
	 * @param right
	 *            the right to set
	 */
	public Node(int value, Node left, Node right) {
		super();
		this.value = new Double(value);
		this.setLeftRight(left, right);
	}

	/**
	 * 
	 * Constructor of the node. This constructor receives all values, for the
	 * case to insert some node in the tree and receives an double as parameter
	 * of the value
	 * 
	 * @param value
	 *            the value of the node
	 * @param left
	 *            the left to set
	 * @param right
	 *            the right to set
	 */
	public Node(double value, Node left, Node right) {
		super();
		this.value = new Double(value);
		this.setLeftRight(left, right);
	}

	/**
	 * 
	 * Constructor of the node. This constructor receives all values, for the
	 * case to insert some node in the tree and receives an float as parameter
	 * of the value
	 * 
	 * @param value
	 *            the value of the node
	 * @param left
	 *            the left to set
	 * @param right
	 *            the right to set
	 */
	public Node(float value, Node left, Node right) {
		super();
		this.value = new Double(value);
		this.setLeftRight(left, right);
	}

	/**
	 * 
	 * Constructor of the node. This constructor receives all values, for the
	 * case to insert some node in the tree and receives an long as parameter of
	 * the value
	 * 
	 * @param value
	 *            the value of the node
	 * @param left
	 *            the left to set
	 * @param right
	 *            the right to set
	 */
	public Node(long value, Node left, Node right) {
		super();
		this.value = new Double(value);
		this.setLeftRight(left, right);
	}

	/**
	 * 
	 * Constructor of the node. This constructor receives all values, for the
	 * case to insert some node in the tree and receives an short as parameter
	 * of the value
	 * 
	 * @param value
	 *            the value of the node
	 * @param left
	 *            the left to set
	 * @param right
	 *            the right to set
	 */
	public Node(short value, Node left, Node right) {
		super();
		this.value = new Double(value);
		this.setLeftRight(left, right);
	}

	/**
	 * 
	 * Constructor of the node. This constructor receives all values, for the
	 * case to insert some node in the tree and receives an byte as parameter of
	 * the value
	 * 
	 * @param value
	 *            the value of the node
	 * @param left
	 *            the left to set
	 * @param right
	 *            the right to set
	 */
	public Node(byte value, Node left, Node right) {
		super();
		this.value = new Double(value);
		this.setLeftRight(left, right);
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
	public Node(Double value, Node left, Node right) {
		super();
		this.value = value;
		this.setLeftRight(left, right);
	}

	/**
	 * Auxiliar function to avoid code repetition, setting the Left and Right
	 * nodes to null
	 */
	private void setLeftRightNull() {
		this.left = null;
		this.right = null;
	}

	/**
	 * 
	 * Auxiliar function to avoid code repetition, setting the Left and Right
	 * nodes
	 * 
	 * @param left
	 * @param right
	 */
	private void setLeftRight(Node left, Node right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
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

	/*
	 * (non-Javadoc)
	 * 
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

	/*
	 * (non-Javadoc)
	 * 
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
		Node other = (Node) obj;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.ufrn.imd.interfaces.NodeInterface#greaterThan(java.lang.Object)
	 */
	@Override
	public boolean greaterThan(Double value) {
		if(this.value.compareTo(value) > 0) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.ufrn.imd.interfaces.NodeInterface#smallerThan(java.lang.Object)
	 */
	@Override
	public boolean smallerThan(Double value) {
		if(this.value.compareTo(value) < 0) {
			return true;
		}
		return false;
	}
}
