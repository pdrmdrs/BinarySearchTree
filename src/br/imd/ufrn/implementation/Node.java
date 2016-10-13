package br.imd.ufrn.implementation;

/**
 * 
 * Class that represents the node of the tree
 * 
 * @author Pedro Paulo Paiva de Medeiros
 *
 */
public class Node<T> {
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

}
