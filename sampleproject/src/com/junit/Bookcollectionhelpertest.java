package com.junit;

import org.junit.*;

import com.cg.helper.Bookcollectionhelper;
import com.exception.BookException;
import com.sampleprojectpackage.BookSchema;

public class Bookcollectionhelpertest {
	static Bookcollectionhelper collectionhelper;
	static BookSchema book=null;
	@BeforeClass
	public static void beforeClass()
	{
		collectionhelper=new Bookcollectionhelper();
		book =new BookSchema(888,"Java Core book",670.25);
	}
	@AfterClass
	public static void afterClass()
	{
		collectionhelper=null;
	}
	
	@Test
 public void testAddNewBook() throws BookException
 {
	 collectionhelper.addNewBookDetails(book);
	 Assert.assertEquals(4, collectionhelper.getbookList().size());
	 Assert.assertNotNull(collectionhelper.toString());
 }
}
