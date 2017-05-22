package day12_2dArrays;

public class Book {

	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut;
	int dayCheckedOut;

	public Book(String bookTitle, int bookPageCount, int bookISBN) {

		this.title = bookTitle;
		this.pageCount = bookPageCount;
		ISBN = bookISBN;
	}

	public int getPageCount() {
		return pageCount;
	}

	public int getISBN() {
		return ISBN;
	}

	public boolean getIsCheckedOut() {
		return isCheckedOut;
	}

	public int getDayCheckedOut() {
		return dayCheckedOut;
	}

	public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
		this.isCheckedOut = newIsCheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
	}
	
	private void setDayCheckedOut(int day) {
		this.dayCheckedOut = day;
	}

	public String getTitle() {
		return title;
	}
}
