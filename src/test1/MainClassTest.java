package test1;

import org.junit.Assert;
import org.junit.Test;
import test1.MainClass;

public class MainClassTest {

    @Test
    public void testGetLocalNumber () {

        MainClass mainClass= new MainClass();

        Assert.assertTrue("getLocalNumber() method does not return 14 number", mainClass.getLocalNumber()==14);
    }
}
