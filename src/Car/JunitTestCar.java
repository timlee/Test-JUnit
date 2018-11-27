import junit.framework.*; 
public class JunitTestCar extends TestCase{
   protected int expectedWheels, expectedHandle;
   protected Car myCar;
   public JunitTestCar(String name) { 
      super(name); 
   }
   protected void setUp() { 
      expectedWheels = 4; 
      expectedHandle =1;
      myCar = new Car(); 
   }   
   public static Test suite() {
      return new TestSuite(JunitTestCar.class);
   }
   public void testGetWheels() { 
      assertEquals(expectedWheels, myCar.getWheels(2));
   } 
   public void testGetHandle() { 
      assertEquals(expectedHandle, myCar.getHandle(2));
   } 

}