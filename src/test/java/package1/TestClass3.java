package package1;

import org.testng.annotations.*;

public class TestClass3 {

    @BeforeClass
    public void beforeClass1(){
        System.out.println("Before Class");
    }

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

    @AfterClass
    public void afterClass2(){
        System.out.println("After Class");
    }

}
