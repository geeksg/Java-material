package com.cg.helper;

import java.util.regex.Pattern;

import com.exception.BookException;

public class Bookdatavalidator

{
public static boolean validateBookName(String bookName) throws BookException
{
	String custPattern="[A-Za-z]{6,20}";
	if(Pattern.matches(custPattern, bookName))
	{
		return true;
	}
	else
	{
		throw new BookException("Bookname invalid");
	}
}
public static boolean validateBookId(String bookId) throws BookException
{
	String idPattern="[0-9]{3}";
	if(Pattern.matches(idPattern, bookId))
	{
		return true;
	}
	else
	{
		throw new BookException("BookId contains only 3 values");
	}
}
public static boolean validateBookPrice(String bookPrice) throws BookException
{
	String pricePattern="\\d{2,4}.?[0-9]{2}$";
	if(Pattern.matches(pricePattern, bookPrice))
	{
		return true;
	}
	else
	{
		throw new BookException("BookId contains only 3 values");
	}
}
}
