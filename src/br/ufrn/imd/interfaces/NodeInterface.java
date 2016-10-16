/**
 * 
 */
package br.ufrn.imd.interfaces;

/**
 * 
 * Interface for the Node to implement the generic comparators
 * 
 * @author Pedro Paulo Paiva de Medeiros
 *
 */
public interface NodeInterface<T> {
	public boolean greaterThan(T value);
	public boolean smallerThan(T value);
}
