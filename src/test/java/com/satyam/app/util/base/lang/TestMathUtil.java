/**
 * 
 */
package com.satyam.app.util.base.lang;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author Satyam Shandilya
 *
 */
public class TestMathUtil {

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.MathUtil#doAddLong(java.util.List)}.
	 */
	@Test
	public void testDoAddLong() {
		List<Long> dataList = new ArrayList<Long>();
		dataList.add(new Long(10));
		dataList.add(new Long(10));
		dataList.add(new Long(10));
		
		long expectedValue = 30;
		
		assertEquals(expectedValue, MathUtil.doAddLong(dataList));
	}
	
	/**
	 * Test method for {@link com.satyam.app.util.base.lang.MathUtil#doAddLong(java.util.List)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testDoAddLongException() {
		List<Long> dataList = null;
		
		long expectedValue = 30;
		
		assertEquals(expectedValue, MathUtil.doAddLong(dataList));
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.MathUtil#doAddInt(java.util.List)}.
	 */
	@Test
	public void testDoAddInt() {
		List<Integer> dataList = new ArrayList<Integer>();
		dataList.add(new Integer(10));
		dataList.add(new Integer(10));
		dataList.add(new Integer(10));
		
		int expectedValue = 30;
		
		assertEquals(expectedValue, MathUtil.doAddInt(dataList));
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.MathUtil#doAddDouble(java.util.List)}.
	 */
	@Test
	public void testDoAddDouble() {
		List<Double> dataList = new ArrayList<Double>();
		dataList.add(new Double(10));
		dataList.add(new Double(10));
		dataList.add(new Double(10));
		
		double expectedValue = 30.0;
		
		assertEquals(expectedValue, MathUtil.doAddDouble(dataList), 0.01);
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.MathUtil#doAverageOfInt(java.util.List)}.
	 */
	@Test
	public void testDoAverageOfInt() {
		List<Integer> dataList = new ArrayList<Integer>();
		dataList.add(new Integer(10));
		dataList.add(new Integer(10));
		dataList.add(new Integer(10));
		
		double expectedValue = 10.0;
		
		assertEquals(expectedValue, MathUtil.doAverageOfInt(dataList), 0.01);
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.MathUtil#doAverageOfDouble(java.util.List)}.
	 */
	@Test
	public void testDoAverageOfDouble() {
		List<Double> dataList = new ArrayList<Double>();
		dataList.add(new Double(10));
		dataList.add(new Double(10));
		dataList.add(new Double(10));
		
		double expectedValue = 10.0;
		
		assertEquals(expectedValue, MathUtil.doAverageOfDouble(dataList), 0.01);
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.MathUtil#doAverageOfLong(java.util.List)}.
	 */
	@Test
	public void testDoAverageOfLong() {
		List<Long> dataList = new ArrayList<Long>();
		dataList.add(new Long(10));
		dataList.add(new Long(10));
		dataList.add(new Long(10));
		
		double expectedValue = 10.0;
		
		assertEquals(expectedValue, MathUtil.doAverageOfLong(dataList), 0.01);
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.MathUtil#doFindMedian(java.util.List)}.
	 */
	@Test
	public void testDoFindMedianOdd() {
		List<Double> dataList = new ArrayList<Double>();
		dataList.add(new Double(10));
		dataList.add(new Double(20));
		dataList.add(new Double(30));
		
		double expectedValue = 20.0;
		
		assertEquals(expectedValue, MathUtil.doFindMedian(dataList), 0.01);
	}
	
	/**
	 * Test method for {@link com.satyam.app.util.base.lang.MathUtil#doFindMedian(java.util.List)}.
	 */
	@Test
	public void testDoFindMedianEven() {
		List<Double> dataList = new ArrayList<Double>();
		dataList.add(new Double(10));
		dataList.add(new Double(20));
		dataList.add(new Double(30));
		dataList.add(new Double(40));
		
		double expectedValue = 25.0;
		
		assertEquals(expectedValue, MathUtil.doFindMedian(dataList), 0.01);
	}

}
