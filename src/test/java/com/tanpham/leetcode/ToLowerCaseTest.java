package com.tanpham.leetcode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.tanpham.algorithm.ToLowerCase;

public class ToLowerCaseTest {

    @Test
    public void allCharShouldBeInLowerCase() {
        assertThat(ToLowerCase.proceed("Hello"), equalTo("hello"));
    }
    
    @Test
    public void allCharShouldBeInLowerCase_2() {
        assertThat(ToLowerCase.proceed("PiTAs"), equalTo("pitas"));
    }
    
}
