import java.util.ArrayList;

// TODO fix the descriptions in this file
public class FlashcardModel {
	private ArrayList<Flashcard> flashcards;
	private int currentID;
	private int index;
	
	public FlashcardModel() {
		this.flashcards = new ArrayList<Flashcard>();
		this.currentID = 0;
		this.index = 0;
	}
	
	/**
	 * Adds card with relevant title and description
	 * @param title - The title for the new card
	 * @param desc - The description/answer for the new card
	 * @return true to indicate that the card was created
	 */
	public void addCard(String title, String desc) {
		flashcards.add(new Flashcard(title, desc, currentID));
		incrementID();
	}
	
	/**
	 * Deletes given card
	 * @param id - The id of the card to be deleted
	 * @return true if the card was found and deleted, false if the card was not found
	 */
	public boolean deleteCard(int id) {
		for (Flashcard f : flashcards) {
			if (f.getID() == id) {
				flashcards.remove(f);
				return true;
			}
		}
		return false;
	}

	/**
	 * increment the unique ID value assigned to successive cards
	 */
	public void incrementID() {
		currentID += 1;
	}
	
	
	/**
	 * Returns the next card in the list of cards. Loops to beginning of list
	 * @return Flashcard object
	 */
	public Flashcard getNext() {
		if (index + 1 == flashcards.size()) {
			index = 0;
		} else {
			index += 1;
		}
		return flashcards.get(index);
	}
	
	/**
	 * Gets the previous card
	 * @return Flashcard object
	 */
	public Flashcard getPrevious() {
		if (index - 1 == -1) {
			index = flashcards.size() - 1;
		} else {
			index -= 1;
		}
		return flashcards.get(index);
	}
	
	/**
	 * Gets the number of cards marked correct
	 * @return int count
	 */
	public int getNumberCorrect() {
		int count = 0;
		for (Flashcard f : flashcards) {
			if (f.getCorrect()) {
				count += 1;
			}
		}
		return count;
	}
	
	/**
	 * Marks given card to be correct
	 * @param id - card ID
	 */
	public void markCorrect(int id) {
		for (Flashcard f : flashcards) {
			if (f.getID() == id) {
				f.setCorrect(true);
			}
		}
	}
	/**
	 * Marks given card to be wrong
	 * @param id - card ID
	 */	
	public void markWrong(int id) {
		for (Flashcard f : flashcards) {
			if (f.getID() == id) {
				f.setCorrect(false);
			}
		}
	}
}
