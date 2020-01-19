package com.googlecode.shubh;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SumTest {

	@Test
	public void testSumTotal() {
		Sum obj = new Sum();
		int ret = obj.SumTotal(2, 3);
		
		Assert.assertEquals(5, ret);
		
	}
		
	@Test
	public void HelloWorldTest() {
		Sum obj = new Sum();
		 obj.HelloWorld();		
		 Assert.assertTrue(true);
}}
