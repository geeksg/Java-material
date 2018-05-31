package com.cg.ui;

import java.util.Scanner;

import com.cg.helper.Bookcollectionhelper;
import com.cg.helper.Bookdatavalidator;
import com.exception.BookException;
import com.sampleprojectpackage.BookSchema;

public class BookUI {
	static Scanner sc=new Scanner(System.in);
	static Bookcollectionhelper collectionhelper=null;
	@SuppressWarnings("static-access")

	public static void main(String[] args)
	{
		int choice=0;
		collectionhelper=new Bookcollectionhelper();
		
		while(true)
		{
			System.out.println("1:Add New Book \n"+"2:Find total count of books \n3:Exit");
			
			System.out.println("\nEnter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: enterNewBookDetails();break;
			case 2: Bookcollectionhelper.displayBookcount();break;
			default:System.exit(0);
			}
		}
		
	}
	private static void enterNewBookDetails()
	{
		System.out.println("How many new books ? ");
		
		int bcount=sc.nextInt();
		
		while(bcount!=0)
		{
			System.out.println("Enter Book id: ");
			String bookId=sc.next();
			try
			{
				if(Bookdatavalidator.validateBookId(bookId))
				System.out.println("Enter Book name: ");
				String bookName=sc.next();
				if(Bookdatavalidator.validateBookName(bookName))
				{
					System.out.println("Enter book price");
					String bookPrice=sc.next();
					{
						if(Bookdatavalidator.validateBookPrice(bookPrice))
						{
							BookSchema book=new BookSchema(Integer.parseInt(bookId),bookName,Double.parseDouble(bookPrice));
						collectionhelper.addNewBookDetails(book);
						}
					}
				}
				bcount--;
			}
		catch (BookException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
}
}