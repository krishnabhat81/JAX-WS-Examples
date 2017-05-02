package com.jaxws;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by krishna1bhat on 5/2/17.
 */
public class AppTest {
    @Test
    public void testLengthOfTheUniqueKey() {

        MyApp obj = new MyApp();
        Assert.assertEquals(36, obj.generateUniqueKey().length());

    }
}
