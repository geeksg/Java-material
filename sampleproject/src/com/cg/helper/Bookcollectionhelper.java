package com.cg.helper;

import java.util.ArrayList;
import java.util.Iterator;

import com.sampleprojectpackage.BookSchema;

public class Bookcollectionhelper {
private static ArrayList<BookSchema> bookList=null;
static
{
	bookList=new ArrayList<BookSchema>();
	// creating an object of BookSchema class
	BookSchema b1=new BookSchema(111,"See into the sea of C",350);
	BookSchema b2=new BookSchema(222,"Learning Java in 21 days",6598);
	BookSchema b3=new BookSchema(236,"Sedra Smith",750);
	//adding above book details into collection
	bookList.add(b1);
	bookList.add(b2);
	bookList.add(b3);
	
}
	public void addNewBookDetails(BookSchema book)
	{
		bookList.add(book);
	}
	
	public static ArrayList<BookSchema> getbookList()
	{
		return bookList;
	}
	public static void setbookList(ArrayList<BookSchema> book){
		Bookcollectionhelper.bookList=bookList;
	}
//Fetch all book details
	public static void displayBookcount()
	{
		Iterator<BookSchema> bookIt=bookList.iterator();
		BookSchema tempBook=null;
		
		int totalcount=0;
		while(bookIt.hasNext())
		{
			totalcount++;
			tempBook=bookIt.next();
			System.out.println(tempBook);
		}
		System.out.println("Total count of books" + totalcount);
	}
}
