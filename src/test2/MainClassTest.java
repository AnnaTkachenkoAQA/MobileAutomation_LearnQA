package test2;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassNumber(){

        MainClass mainClass = new MainClass();
        Assert.assertTrue("getClassNumber() method returns number <= 45" ,mainClass.getClassNumber()>45);
    }
}
