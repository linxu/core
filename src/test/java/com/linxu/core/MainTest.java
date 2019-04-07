package com.linxu.core;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Alfred
 * @date 2019-04-07
 */
public class MainTest {
    @Test
    public void test() {
        Assert.assertTrue(new Main().eq("a", "a"));
    }
}
