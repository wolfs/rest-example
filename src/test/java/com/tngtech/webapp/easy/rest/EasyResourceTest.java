package com.tngtech.webapp.easy.rest;

import org.junit.Assert;
import org.junit.Test;

public class EasyResourceTest {
    @Test
    public void toStringShouldWork() {
        EasyResource easyResource = new EasyResource();
        Assert.assertEquals("hello, world", easyResource.getString());
    }

}
