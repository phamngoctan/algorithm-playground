package com.tanpham.leetcode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ToLowerCaseTest {

    @Test
    public void allCharShouldBeInLowerCase() {
        assertThat(ToLowerCase.proceed("Hello"), equalTo("hello"));
    }
    
}
