package package2;

import org.testng.annotations.*;

public class TestClass3 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method in TestClass3");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method in TestClass3");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 in TestClass3");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 in TestClass3");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test in TestClass3");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test in TestClass3");
    }
}
