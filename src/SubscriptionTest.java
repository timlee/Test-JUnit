import org.junit.* ;
import static org.junit.Assert.* ;

public class SubscriptionTest {
	
	@Test
	public void test_returnEuro() {
		Subscription S = new Subscription(200,2) ;
		System.out.println(S.pricePerMonth());
		assertTrue(S.pricePerMonth() == (double) 1) ;
	}
	@Before
	public set(){
		
	}
	
	@Test
	public void test_roundingup() {
		Subscription S3 = new Subscription(200,3) ;
		System.out.println(S3.pricePerMonth());
		assertTrue(S3.pricePerMonth() == (double) 0.67) ;
	}
}