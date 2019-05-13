package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.AbsoluteAdd;

public class AbsoluteAddTest {
	AbsoluteAdd aAdd;
	@Before
	public void setUp() throws Exception {
		aAdd = new AbsoluteAdd();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testXAdd() {
		assertEquals(8, aAdd.xAdd(3, 5));
	}

}
