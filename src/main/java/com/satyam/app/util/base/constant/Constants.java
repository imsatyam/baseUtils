package com.satyam.app.util.base.constant;

/**
 * Contains basic constants that can be used in any application
 * @author Satyam Shandilya
 *
 */
public interface Constants {
	
	//Basic
	String EMPTY = "";
	String SPACE = " ";
	String COLON = ":";
	String SEMI_COLON = ";";
	String COMMA = ",";
	
	//Brackets
	String LEFT_PARENTHESIS = "(";
	String RIGHT_PARENTHESIS = ")";
	String LEFT_BRACKET = "[";
	String RIGHT_BRACKET = "]";
	
	//Basic delimiters
	String ROW_DELIMITER = ";;!!;;";
	String COLUMN_DELIMITER = ",,!!,,";
	
	//Status
	String SUCCESS = "success";
	String FAILURE = "failure";
	String ERROR = "error";
	
	//Message
	String ERR_PARAM_NULL = "Input parameter cannot be null.";
	String ERR_PARAMS_NULL = "Input parameters cannot be null.";
	String ERR_PARAM_INVALID = "Input parameter is invalid.";
	String ERR_PARAMS_INVALID = "Input parameters is invalid.";
	
	//Default Data pattern
	String MM_DD_YYYY = "mm/dd/yyyy";
	
	//Algorithms
	String ALGO_SHA_1 = "SHA-1";
	int ALGO_ITERATIONS = 50000;
	String ALGO_SALT = "SHA1SALT";
	
	//Exception types
	int WARN = 1;
	int CONCERN = 2;
	int SEVERE = 3;

}
