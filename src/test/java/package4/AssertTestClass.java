package package4;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssertTestClass {
    @Test
    public void test1(){

        Assert.assertTrue(9 > 2);

    }

    @Test
    public void test2(){

        Assert.assertFalse(2 > 2);

    }

    @Test
    public void test3(){

        Assert.assertEquals(1, 1);

    }

    @Test
    public void test4(){

        int x = 10;

        if(x > 1){
            Assert.fail();
        }

    }

    @Test
    public void test5(){

        Assert.assertNotEquals(2, 1);

    }

    @Test
    public void test6(){

        Assert.assertNotNull(2);

    }

}
