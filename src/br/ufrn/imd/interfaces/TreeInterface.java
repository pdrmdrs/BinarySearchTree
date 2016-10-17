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
public interface TreeInterface {
	public void insert(Double element);
	
	public void delete(Double element);
	
	public Number search(Double value);
	
	public boolean isBST();
}
