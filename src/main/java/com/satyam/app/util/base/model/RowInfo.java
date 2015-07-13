/**
 * 
 */
package com.satyam.app.util.base.model;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;

import com.satyam.app.util.base.lang.Assert;
import com.satyam.app.util.base.lang.DataUtil;
import com.satyam.app.util.base.lang.StringUtil;


/**
 * Represents the list of data present in a row as given by delimited string
 * If our delimited string is like a,b,c,d,e;;;f,g,h,i,j, then this class holds a,b,c,d,e as List<String>
 * @author Satyam Shandilya
 *
 */
public final class RowInfo {

	private final List<String> rowDataList;
	private final String delimitedString;
	private final String delimiter;
	
	/**
	 * This is to be called for String to List manipulation
	 * @param delimitedRowData
	 * @param delimiter
	 */
	public RowInfo(final List<String> rowDataList, final String delimiter){
		
		Assert.notEmpty(rowDataList);
		Assert.hasLength(delimiter);
		
		this.delimiter = delimiter;
		this.rowDataList = rowDataList;
		this.delimitedString = StringUtil.doListToDelimitedString(rowDataList, delimiter);
	}
	
	
	/**
	 * This is to be called for String to List manipulation
	 * @param delimitedRowData
	 * @param delimiter
	 */
	public RowInfo(final String delimitedRowData, final String delimiter){
		
		Assert.hasLength(delimitedRowData);
		Assert.hasLength(delimiter);
		
		this.delimitedString = delimitedRowData;
		this.delimiter = delimiter;
		this.rowDataList = new LinkedList<String>();
		populateRowData(delimitedRowData, delimiter);
	}
	
	
	/**
	 * Populates the row data from delimited string
	 * @param delimitedRowData
	 * @param delimiter
	 */
	private final void populateRowData(final String delimitedRowData, final String delimiter){
		
		final StringTokenizer columnTokenizer = new StringTokenizer(delimitedRowData, delimiter);
		
		if(!DataUtil.isNull(columnTokenizer)){
			String data = null;
			while(columnTokenizer.hasMoreTokens()){
				
				data = columnTokenizer.nextToken();
				
				if(StringUtils.isNotEmpty(data)){
					this.rowDataList.add(data);
				}
				
			}
		}
	}


	/**
	 * Get row Data
	 * @return
	 */
	public List<String> getRowDataList() {
		return rowDataList;
	}


	/**
	 * get delimited String
	 * @return
	 */
	public String getDelimitedString() {
		return delimitedString;
	}


	/**
	 * Get delimiter
	 * @return
	 */
	public String getDelimiter() {
		return delimiter;
	}
	
}
