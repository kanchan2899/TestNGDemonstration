package package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class SetupClass {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuiteMethod1(){
        System.out.println("Before Suite Method 1");
    }

    @BeforeSuite
    public void beforeSuiteMethod2(){
        System.out.println("Before Suite Method 2");
    }

    @BeforeClass
    public void beforeClass1(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass2(){
        System.out.println("After Class");
    }

    @AfterSuite(alwaysRun = true)
    public void AfterSuiteMethod1(){
        System.out.println("After Suite Method 1");
    }

    @AfterSuite
    public void afterSuiteMethod2(){
        System.out.println("After Suite Method 2");
    }

}
