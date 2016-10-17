/**
 * 
 */
package br.ufrn.imd.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ufrn.imd.implementation.Node;
import br.ufrn.imd.implementation.Tree;

/**
 * @author Pedro Paulo Paiva de Medeiros
 *
 */
public class TreeTest {
	
	private Tree t;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.t = new Tree(new Node(10));
	}

	/**
	 * Test method for {@link br.ufrn.imd.implementation.Tree#insert(java.lang.Double)}.
	 */
	@Test
	public void testInsert() {
		Double expectedRightValue = new Double(15);
		Double expectedLeftValue = new Double(5);
		
		this.t.insert(expectedRightValue);
		this.t.insert(expectedLeftValue);
		
		assertEquals(this.t.getRoot().getRight().getValue(), expectedRightValue, 0);
		assertEquals(this.t.getRoot().getLeft().getValue(), expectedLeftValue, 0);
		
		Double expectedLastRightValue = new Double(20);
		
		this.t.insert(expectedLastRightValue);
		
		assertEquals(this.t.getRoot().getRight().getRight().getValue(), expectedLastRightValue, 0);
	}

	/**
	 * Test method for {@link br.ufrn.imd.implementation.Tree#delete(java.lang.Double)}.
	 */
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link br.ufrn.imd.implementation.Tree#search(java.lang.Double)}.
	 */
	@Test
	public void testSearch() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link br.ufrn.imd.implementation.Tree#isBST()}.
	 */
	@Test
	public void testIsBST() {
		fail("Not yet implemented");
	}

}
