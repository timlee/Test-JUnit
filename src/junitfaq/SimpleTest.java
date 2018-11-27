import java.util.*;
import junit.framework.*;

public class SimpleTest extends TestCase {
	
	public SimpleTest(String name){
		super(name);
	}
	
	public void testEmptyCollection(){
		Collection collection = new ArrayList();
		assertTrue(collection.isEmpty());
	}
	
	public static Test suite(){
		return new TestSuite(SimpleTest.class);
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}

}
