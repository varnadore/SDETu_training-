package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Greater";
		bookTitle = "No Greater Habits";
		
		 if (bookTitle.contains(wordChoice)) {
		System.out.println("The book title contains the word " + wordChoice);
		}
	}
}
