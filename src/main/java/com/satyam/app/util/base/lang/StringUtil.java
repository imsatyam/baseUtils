package com.satyam.app.util.base.lang;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;

import com.satyam.app.util.base.model.RowInfo;


/**
 * Class which provides important utility methods for string manipulation
 * @author Satyam Shandilya
 *
 */
public abstract class StringUtil {

	/**
	 * Converts a delimited string of row-column type into List
	 * @param delimitedString
	 * @param rowDelimiter
	 * @param columnDelimiter
	 * @return
	 */
	public static List<RowInfo> doDelimitedStringToList (String delimitedString, String rowDelimiter, String columnDelimiter){
		
		Assert.hasLength(delimitedString);
		Assert.hasLength(rowDelimiter);
		Assert.hasLength(columnDelimiter);
		
		List<RowInfo> rowList = null;
		
		StringTokenizer rowTokenizer = new StringTokenizer(delimitedString, rowDelimiter);
		
		if(!DataUtil.isNull(rowTokenizer)){
			
			rowList = new LinkedList<RowInfo>();
			String rowString = null;
			RowInfo row = null;
			
			while(rowTokenizer.hasMoreTokens()){
				rowString = rowTokenizer.nextToken();
				if(StringUtils.isNotEmpty(rowString)){
					row = new RowInfo(rowString, columnDelimiter);
					rowList.add(row);
				}
			}
		}
		
		return rowList;
	}
	
	/**
	 * Creates delimited string from the List of data
	 * @param rowDataList
	 * @param delimiter
	 * @return
	 */
	public static String doListToDelimitedString(List<String> rowDataList, String delimiter){
		
		Assert.notEmpty(rowDataList);
		Assert.hasLength(delimiter);
		
		int dataIndex = 0;
		StringBuffer buffer = new StringBuffer();
		for(String rowData : rowDataList){
			buffer.append(rowData);
			
			if(dataIndex < rowDataList.size() - 1){
				buffer.append(delimiter);
			}
		}
		
		return buffer.toString();
	}
	
}
