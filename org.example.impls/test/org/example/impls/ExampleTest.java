package org.example.impls;

import junit.framework.TestCase;

public class ExampleTest extends TestCase {
	public void testSaysHello() throws Exception {
		String result = new Example().sayHello("Bob");
		assertEquals("Hello Bob", result);
	}
}
