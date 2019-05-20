package nknu.shoppingcart;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {
	
	ShoppingCart cart;
	Product book;

	@Before
	public void setUp() throws Exception {
		cart = new ShoppingCart();
		book = new Product("Programming","Java - How to Program",500);
		cart.addItem(book);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddItem() {
		Product book2 = new Product("Programming","C++", 600); 
		cart.addItem(book2);
		assertEquals(2, cart.getItemCount());
	}

	@Test
	public void testRemoveItem() throws ProductNotFoundException {
		cart.removeItem(book);
		assertEquals(0, cart.getItemCount());
	}

	@Test
	public void testGetItemCount() {
		Product book2 = new Product("Programming","C++", 600); 
		cart.addItem(book2);
		assertEquals(2, cart.getItemCount());
	}

	@Test
	public void testEmpty() {
		cart.empty();
		assertEquals(0, cart.getItemCount());
		
	}

}
