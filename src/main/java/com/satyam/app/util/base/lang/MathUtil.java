/**
 * 
 */
package com.satyam.app.util.base.lang;

import java.util.Collections;
import java.util.List;


/**
 * Provides utility functions for basic mathematical operations
 * @author Satyam Shandilya
 *
 */
public abstract class MathUtil {

	/**
	 * Addition of long values
	 * @param dataList
	 * @return
	 */
	public static long doAddLong(List<Long> dataList){
	
		Assert.notEmpty(dataList);
		
		long sum = 0L;
		
		for(Long data : dataList){
			sum = sum + data.longValue();
		}
		
		return sum;
	}
	
	/**
	 * Addition of int values
	 * @param dataList
	 * @return
	 */
	public static int doAddInt(List<Integer> dataList){
	
		Assert.notEmpty(dataList);
		
		int sum = 0;
		
		for(Integer data : dataList){
			sum = sum + data.intValue();
		}
		
		return sum;
	}
	
	/**
	 * Addition of double values
	 * @param dataList
	 * @return
	 */
	public static double doAddDouble(List<Double> dataList){
	
		Assert.notEmpty(dataList);
		
		double sum = 0;
		
		for(Double data : dataList){
			sum = sum + data.doubleValue();
		}
		
		return sum;
	}
		
	/**
	 * Get average of a list of integer values
	 * @param dataList
	 * @return
	 */
	public static double doAverageOfInt(List<Integer> dataList){
		
		Assert.notEmpty(dataList);
		
		int sum = doAddInt(dataList);
		int size = dataList.size();
		
		return (double)sum / (double)size;
		
	}
	
	/**
	 * Do average of a list of double values
	 * @param dataList
	 * @return
	 */
	public static double doAverageOfDouble(List<Double> dataList){
	
		Assert.notEmpty(dataList);
		
		double sum = doAddDouble(dataList);
		int size = dataList.size();
		
		return sum / size;
	}
	
	/**
	 * Do average of a list of Long values
	 * @param dataList
	 * @return
	 */
	public static double doAverageOfLong(List<Long> dataList){
	
		Assert.notEmpty(dataList);
		
		long sum = doAddLong(dataList);
		int size = dataList.size();
		
		return (double)sum / (double)size;
	}
	
	/**
	 * Do median of a list of double values
	 * @param dataList
	 * @return
	 */
	public static double doFindMedian(List<Double> dataList){
	
		Assert.notEmpty(dataList);
		
		Collections.sort(dataList);
		
		double median = 0;
		
		// If our array's length is even, then we need to find the average of the two centered values
		if (dataList.size() % 2 == 0)
		{
			int indexA = (dataList.size() - 1) / 2;
			int indexB = dataList.size() / 2;
			
			median = ((double) (dataList.get(indexA) + dataList.get(indexB))) / 2;
		}
		// Else if our array's length is odd, then we simply find the value at the center index
		else  
		{
			int index = (dataList.size() - 1) / 2;
			median = dataList.get(index);
		}
		
		return median;
	}
	
}
