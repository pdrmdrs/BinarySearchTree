/**
 * 
 */
package br.ufrn.imd.interfaces;

/**
 * 
 * Interface of the methods that the Binary Search Tree should have
 * 
 * @author Pedro Paulo Paiva de Medeiros
 *
 */
public interface TreeInterface<T> {
	public void insert(T element);
	
	public void delete(T element);
	
	public T search(T value);
	
	public boolean isBST();
}
