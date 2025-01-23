import java.util.Scanner;
class Book {
	    private String title;
	    private String author;
	    private int pages;

	    // Constructor to initialize the Book object
	    public Book(String title, String author, int pages) {
	        this.title = title;
	        this.author = author;
	        this.pages = pages;
	    }
	    // Method to display book details
	    public void displayDetails() {
	        // Using 'this' to invoke the current class's method
	        this.showInfo();
	    }

	    // Another method to show book info
	    public void showInfo() {
	        System.out.println("Title: " + this.title);
	        System.out.println("Author: " + this.author);
	        System.out.println("Pages: " + this.pages);
	    }
public class classMethod_thiskeyword {
	    public static void main(String[] args) {
			// TODO Auto-generated method stub

	        Book myBook = new Book("1984 Java", "Games Gosling", 423);
	        
	        // displayDetails method
	        myBook.displayDetails();
	    }
	
	}
	}

	
*/Output
title:1984 Java
author:Games Gosling
pages:423
*/
