package com.javaex.ex10;

public class Book {
    
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	this.stateCode = 1;
    }
    
    

	public int getBookNo() {
		return bookNo;
	}



	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}


	public void rent() {
		this.stateCode = 0;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
    
    public void print() {
    	String info = "재고 있음";
    	
    	if(this.stateCode == 0) {
    		info = "재고없음";
    	}
    	
    	System.out.println(bookNo+"책 제목: "+title+", 작가: "+author+", 대여 유무: "+info);
    }
}
