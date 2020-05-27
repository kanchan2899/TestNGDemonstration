package package1;

import org.testng.annotations.*;

public class TestClass2 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method in TestClass2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method in TestClass2");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 in TestClass2");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 in TestClass2");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test in TestClass2");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test in TestClass2");
    }
}
