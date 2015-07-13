package com.satyam.app.util.base.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test Cases for DataUtil class
 * @author Satyam Shandilya
 *
 */
public class TestDataUtil {

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#isNull(java.lang.Object)}.
	 */
	@Test
	public void testIsNull() {
		String nullString = null;
		assertTrue(DataUtil.isNull(nullString));
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getString(java.lang.Object)}.
	 */
	@Test
	public void testGetString() {
		Integer value = new Integer(10);
		String expectedValue = "10";
		assertEquals(expectedValue, DataUtil.getString(value));
	}
	
	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getString(java.lang.Object)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testGetStringException() {
		Integer value = null;
		String expectedValue = "10";
		assertEquals(expectedValue, DataUtil.getString(value));
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getStringWithEmptyAsDefault(java.lang.Object)}.
	 */
	@Test
	public void testGetStringWithEmptyAsDefault() {
		Integer value = null;
		String expectedValue = "";
		assertEquals(expectedValue, DataUtil.getStringWithEmptyAsDefault(value));
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getStringAfterNaNAndInfiniteCheck(java.lang.Double)}.
	 */
	@Test
	public void testGetStringAfterNaNAndInfiniteCheck() {
		Double value = 1.2D;
		String expectedValue = "1.2";
		assertEquals(expectedValue, DataUtil.getStringAfterNaNAndInfiniteCheck(value));
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getInt(java.lang.String)}.
	 */
	@Test
	public void testGetInt() {
		String value = "10";
		int expectedValue = 10;
		assertEquals(expectedValue, DataUtil.getInt(value));
	}
	
	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getInt(java.lang.String)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testGetIntExceptionNull() {
		String value = null;
		int expectedValue = 10;
		assertEquals(expectedValue, DataUtil.getInt(value));
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getInt(java.lang.String)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testGetIntExceptionDataType() {
		String value = "10.2";
		int expectedValue = 10;
		assertEquals(expectedValue, DataUtil.getInt(value));
	}
	
	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getDouble(java.lang.String)}.
	 */
	@Test
	public void testGetDouble() {
		String value = "10.2";
		double expectedValue = 10.2;
		assertEquals(expectedValue, DataUtil.getDouble(value), 0.01);
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getFloat(java.lang.String)}.
	 */
	@Test
	public void testGetFloat() {
		String value = "10.2";
		float expectedValue = 10.2f;
		assertEquals(expectedValue, DataUtil.getFloat(value), 0.01);
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getByte(java.lang.String)}.
	 */
	@Test
	public void testGetByte() {
		String value = "10";
		byte expectedValue = 10;
		assertEquals(expectedValue, DataUtil.getByte(value));
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getShort(java.lang.String)}.
	 */
	@Test
	public void testGetShort() {
		String value = "10";
		short expectedValue = 10;
		assertEquals(expectedValue, DataUtil.getShort(value));
	}

	/**
	 * Test method for {@link com.satyam.app.util.base.lang.DataUtil#getLong(java.lang.String)}.
	 */
	@Test
	public void testGetLong() {
		String value = "10";
		long expectedValue = 10;
		assertEquals(expectedValue, DataUtil.getLong(value));
	}

}
