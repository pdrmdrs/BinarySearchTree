/**
 * 
 */
package br.ufrn.imd.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ufrn.imd.implementation.Node;

/**
 * @author Pedro Paulo Paiva de Medeiros
 *
 */
public class NodeTest {

	private Node n1;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		n1 = new Node(1);
	}

	/**
	 * Test method for {@link br.ufrn.imd.implementation.Node#greaterThan(java.lang.Double)}.
	 */
	@Test
	public void testGreaterThan() {
		assertEquals(n1.greaterThan(new Double(0)), true);
		assertEquals(n1.greaterThan(new Double(2)), false);
	}

	/**
	 * Test method for {@link br.ufrn.imd.implementation.Node#smallerThan(java.lang.Double)}.
	 */
	@Test
	public void testSmallerThan() {
		assertEquals(n1.smallerThan(new Double(0)), false);
		assertEquals(n1.smallerThan(new Double(2)), true);
	}

}
