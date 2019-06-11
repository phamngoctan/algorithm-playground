package com.tanpham.leetcode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void test_1() {
        assertThat(ReverseInteger.reverse(12), equalTo(21));
    }
    
    @Test
    public void test_2() {
        assertThat(ReverseInteger.reverse(120), equalTo(21));
    }
    
    @Test
    public void test_3() {
        assertThat(ReverseInteger.reverse(-123), equalTo(-321));
    }
    
    @Test
    public void test_4() {
        assertThat(ReverseInteger.reverse(1534236469), equalTo(0));
    }
    
}
