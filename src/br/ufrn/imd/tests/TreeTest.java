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
		
//		this.t.insert(new Double(5));
//		this.t.insert(new Double(15));
//		this.t.insert(new Double(2));
//		this.t.insert(new Double(7));
//		this.t.insert(new Double(13));
//		this.t.insert(new Double(25));
//		this.t.insert(new Double(1));
//		this.t.insert(new Double(3));
//		this.t.insert(new Double(6));
//		this.t.insert(new Double(9));
//		this.t.insert(new Double(20));
//		this.t.insert(new Double(30));
	}

	/**
	 * Test method for {@link br.ufrn.imd.implementation.Tree#insert(java.lang.Double)}.
	 */
	@Test
	public void testInsert() {
		Double expectedRightValue = new Double(90);
		Double expectedLeftValue = new Double(5);
		
		this.t.insert(expectedRightValue);
		this.t.insert(expectedLeftValue);
		
		assertEquals(this.t.search(expectedRightValue), expectedRightValue, 0);
		assertEquals(this.t.search(expectedLeftValue), expectedLeftValue, 0);
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
		assertEquals(this.t.search(new Double(6)), new Double(6));
		assertEquals(this.t.search(new Double(3)), null);
	}

	/**
	 * Test method for {@link br.ufrn.imd.implementation.Tree#isBST()}.
	 */
	@Test
	public void testIsBST() {
		fail("Not yet implemented");
	}

}
