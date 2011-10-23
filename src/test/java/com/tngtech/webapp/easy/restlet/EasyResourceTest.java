package com.tngtech.webapp.easy.restlet;

import org.junit.Assert;
import org.junit.Test;

public class EasyResourceTest {
    @Test
    public void toStringShouldWork() {
        EasyResource easyResource = new EasyResource();
        Assert.assertEquals("hello, world", easyResource.toString());
    }

}
