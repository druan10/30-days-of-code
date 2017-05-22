package day11_2dArrays;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

	Map<String, Book> bookCollection = new HashMap<String, Book>();
	int currentDay = 0;
	int lengthOfCheckoutPeriod = 7;
	double initialLateFee = 0.50;
	double feePerLateDay = 1.00;

	public LibraryCatalogue(Map<String, Book> collection) {
		this.bookCollection = collection;
	}

	public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckoutPeriod, double initalLateFee,
			double feePerLateDay) {
		this.bookCollection = collection;
		this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
		this.initialLateFee = initalLateFee;
		this.feePerLateDay = feePerLateDay;
	}

	public int getCurrentDay() {
		return currentDay;
	}

	public Map<String, Book> getBookCollection() {
		return bookCollection;
	}

	public Book getBook(String bookTitle) {
		return getBookCollection().get(bookTitle);
	}

	public int getLengthOfCheckoutPeriod() {
		return lengthOfCheckoutPeriod;
	}

	public double getInitialLateFee() {
		return initialLateFee;
	}

	public double getFeePerLateDay() {
		return feePerLateDay;
	}

	public void nextDay() {
		currentDay++;
	}

	public void setDay(int day) {
		currentDay = day;
	}

	// Instance Methods

	public void checkOutBook(String title) {
		Book book = getBook(title);
		if (book.getIsCheckedOut()) {
			sorryBookAlreadyCheckedOut(book);
		} else {
			book.setIsCheckedOut(true, currentDay);
			System.out.println("You just checked out " + title + ".\n It is due on day " + 
			(getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
		}
	}

	public void returnBook(String title) {
		Book book = getBook(title);
		int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
		System.out.println("Thank you for returning " + book.getTitle() + ".");
		if (daysLate > 0) {
			System.out.println("You owe the library " + (getInitialLateFee() + getFeePerLateDay() * daysLate) + "because your book is " + daysLate + "late.");
		}
		book.setIsCheckedOut(false, -1);
	}

	public void sorryBookAlreadyCheckedOut(Book book) {
		System.out.println("Sorry, " + book.getTitle() + " is already checked out!");
	}

	public static void main(String[] args) {
		
		// Sample Library
		Map<String, Book> bookCollection = new HashMap<String, Book>();
		Book harry = new Book("Harry Potter", 87132, 99999999);
		bookCollection.put("Harry Potter", harry);
		LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
		lib.checkOutBook("Harry Potter");
		lib.nextDay();
		lib.nextDay();
		lib.checkOutBook("Harry Potter");
		lib.nextDay();
		lib.returnBook("Harry Potter");
	}
}
