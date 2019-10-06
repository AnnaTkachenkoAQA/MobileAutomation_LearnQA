package test3;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassString (){
        MainClass mainClass= new MainClass();

        String fullClassString = mainClass.getClassString();

        Assert.assertTrue("class_string does not contain words \"hello\" or \"Hello\"", fullClassString.contains("hello")||fullClassString.contains("Hello"));

    }
}
