/*
 * Created on 2006/5/14
 * Author: Nick Hsueh of FCU.IECS 
 */
import junit.framework.TestCase;

/** 
 * Since the code does not define "main", you should run it with "TestRunner".
 * If you have plug Junit in Eclipse, you can run it by choosing
 * "Run as" --> "Junit test", instead of Java Application
 */
public class TestScoreFinder extends TestCase {
	int[] score;
	int key;
	ScoreFinder sf;
	
	//setUp() will be called in each testXXX. 
	//it is used to initialize the configuration for each test
	protected void setUp() {
		//the following code may not make sense, I write it just for demo.
		sf = new ScoreFinder();
	}
	
	//tearDown() will be called when the testXXX is completed.
	//it is used to clear all configuration
	protected void tearDown() {
		// the following code may not make sense, I write it just for demo.
		sf = null;
		score = null;
		key = 0;
	}
	
	public void testSearch1() {
		int [] t = {17};
		score = t;
		key = 17;
		assertEquals(sf.search(score, key), 0);		
	}

	public void testSearch2() {
		int [] t = {17,12};
		score = t;
		key = 17;
		assertEquals(sf.search(score, key), 0);		
	}
	
	public void testSearch3() {
		int [] t = {18,12,99};
		score = t;
		key = 17;
		assertEquals(sf.search(score, key), -1);		
	}

	// 我們故意將這個 test case 設計錯誤，this will cause a Failur (expected result 
	// != actual result.
	public void testSearch4() {
		int [] t = {18,12,99,100};
		score = t;
		key = 99;
		assertEquals(sf.search(score, key), 5);		
	}

	// This will cause ERROR, since our code does not hand null array
	public void testSearch5() {
		int [] t = null;
		score = t;
		key = 99;
		assertEquals(sf.search(score, key), -1);		
	}
}
