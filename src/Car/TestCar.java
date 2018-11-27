
// This code test Car without using JUNIT

public class TestCar {//執行測試的類別 
    public static void main(String[] args){ 
        TestCar myTest = new TestCar(); 
        myTest.testGetWheels(); 
        myTest.testGetHandle(); 
    }
    public void testGetWheels(){ 
        int [] input = {2, 3, 4, 5};
        int [] expectedWheels = {4, 3, 8, 10}; 

        Car myCar = new Car();
        for (int i=0; i< input.length; i++) {
           System.out.print("("+input[i]+","+expectedWheels[i]+"):");
           if (expectedWheels[i]==myCar.getWheels(input[i]))
               System.out.println("test [Car]: getWheels works perfected!"); 
           else 
               System.out.println("test [Car]: getWheels DOESN'T work!"); 
        }
    } 
    public void testGetHandle(){ 
        int [] input = {2, 3, 4, 5};
        int [] expectedHandle = {1, 1, 8, 1}; 

        Car myCar = new Car();
        for (int i=0; i< input.length; i++) {
           System.out.print("("+input[i]+","+expectedHandle[i]+"):");
           if (expectedHandle[i]==myCar.getHandle(input[i]))
               System.out.println("test [Car]: getHandle works perfected!"); 
           else 
               System.out.println("test [Car]: getHandle DOESN'T work!"); 
        }
    } 
} 
