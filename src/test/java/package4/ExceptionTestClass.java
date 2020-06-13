package package4;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.thread.IThreadWorkerFactory;

public class ExceptionTestClass {

    @Test
    public void test1(){
        System.out.println("Test Passed");
    }

    @Test
    public void test() throws Exception {
        int x = 10;
        if(x > 1){
            throw new Exception("x is greater than 1");
        }

        System.out.println("Register this issue");
    }

    @Test
    public void test2(){
        throw new SkipException("Skipping Exception");
    }

}
