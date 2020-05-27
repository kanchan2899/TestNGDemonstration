package package2;

import org.testng.annotations.*;

public class TestClass1 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method in TestClass1");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method in TestClass1");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 in TestClass1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 in TestClass1");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test in TestClass1");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test in TestClass1");
    }
}
