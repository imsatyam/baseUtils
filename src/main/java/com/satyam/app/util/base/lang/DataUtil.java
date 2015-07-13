/**
 * 
 */
package com.satyam.app.util.base.lang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.satyam.app.util.base.constant.Constants;

/**
 * Provides basic null, empty validation for various types of data types
 * @author Satyam Shandilya
 *
 */
public abstract class DataUtil {
	
	private static final Logger LOG = LoggerFactory.getLogger(DataUtil.class);

	/**
	 * Check if the object is null
	 * @param object
	 * @return
	 */
	public static boolean isNull(Object object){
		
		boolean isNull = false;
		if(object == null){
			isNull = true;
		}
		return isNull;
	
	}
	
	/**
	 * Get string value of given object. If object is null, it throws an exception
	 * @param input
	 * @return
	 */
	public static String getString(Object input){
		
		Assert.notNull(input);
		return input.toString();
	}
	
	/**
	 * Returns String value of Object. If object is null it returns empty string.
	 * @param input
	 * @param returnEmpty
	 * @return
	 */
	public static String getStringWithEmptyAsDefault(Object input){
		
		String returnValue = Constants.EMPTY;
		
		if(!isNull(input)){
			returnValue = input.toString();
		}
		
		return returnValue;
	}
	
	/**
	 * Get string value of double variable after NaN and infinity check
	 * @param input
	 * @return
	 */
	public static String getStringAfterNaNAndInfiniteCheck(Double input){
		
		String returnValue = Constants.EMPTY;
		
		if(!isNull(input) && !input.isNaN() && !input.isInfinite()){
			returnValue = input.toString();
		}
		
		return returnValue;
	}
	
	/**
	 * Get integer value of a String
	 * @param input
	 * @return
	 */
	public static int getInt(String input){
		
		Assert.hasLength(input);
		
		int value = 0;
		try{
			value = Integer.parseInt(input);
		}catch(Exception exception){
			LOG.error("An exception occurred: ", exception);
			throw new IllegalArgumentException(exception.getMessage(), exception.getCause());
		}
		return value;
	}
	
	/**
	 * Get double value of a String
	 * @param input
	 * @return
	 */
	public static double getDouble(String input){
		
		Assert.hasLength(input);
		
		double value = 0;
		try{
			value = Double.parseDouble(input);
		}catch(Exception exception){
			LOG.error("An exception occurred: ", exception);
			throw new IllegalArgumentException(exception.getMessage(), exception.getCause());
		}
		return value;
	}
	
	/**
	 * Get float value of  a String
	 * @param input
	 * @return
	 */
	public static float getFloat(String input){
		
		Assert.hasLength(input);
		
		float value = 0f;
		try{
			value = Float.parseFloat(input);
		}catch(Exception exception){
			LOG.error("An exception occurred: ", exception);
			throw new IllegalArgumentException(exception.getMessage(), exception.getCause());
		}
		return value;
	}
	
	/**
	 * Get byte value of a String
	 * @param input
	 * @return
	 */
	public static byte getByte(String input){
		
		Assert.hasLength(input);
		
		byte value = 0;
		try{
			value = Byte.parseByte(input);
		}catch(Exception exception){
			LOG.error("An exception occurred: ", exception);
			throw new IllegalArgumentException(exception.getMessage(), exception.getCause());
		}
		return value;
	}
	
	/**
	 * Get Short value of a String
	 * @param input
	 * @return
	 */
	public static short getShort(String input){
		
		Assert.hasLength(input);
		
		short value = 0;
		try{
			value = Short.parseShort(input);
		}catch(Exception exception){
			LOG.error("An exception occurred: ", exception);
			throw new IllegalArgumentException(exception.getMessage(), exception.getCause());
		}
		return value;
	}
	
	/**
	 * Get Long value of a String
	 * @param input
	 * @return
	 */
	public static long getLong(String input){
		
		Assert.hasLength(input);
		
		long value = 0;
		try{
			value = Long.parseLong(input);
		}catch(Exception exception){
			LOG.error("An exception occurred: ", exception);
			throw new IllegalArgumentException(exception.getMessage(), exception.getCause());
		}
		return value;
	}
	
}
