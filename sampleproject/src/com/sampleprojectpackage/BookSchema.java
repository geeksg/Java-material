package com.sampleprojectpackage;

public class BookSchema
{
	private int bookId;
	private String bookName;
	private double bookPrice;
	public BookSchema(){}
	
	public BookSchema(int bookId,String bookName,double bookPrice)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}
		public int getbookId()
		{
			return bookId;
		}
		public void setbookId(int bookId)
		{
			this.bookId=bookId;
		}
		public String getbookName()
		{
			return bookName;
		}
		public void setbookName(String bookName)
		{
			this.bookName=bookName;
		}
		public double getbookPrice()
		{
			return bookPrice;
		}
		public void setbookPrice(double bookPrice)
		{
			this.bookPrice=bookPrice;
		}
		
		public String toString(){
			return "Book [bookId="+bookId+",bookName="+bookName+",bookPrice="+bookPrice+"]";
		}
	}