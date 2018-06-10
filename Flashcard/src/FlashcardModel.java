import java.util.ArrayList;

public class FlashcardModel {
	private ArrayList<Flashcard> flashcards;
	private int size;
	private int currentID;
	private int index;
	
	public FlashcardModel() {
		this.flashcards = new ArrayList<Flashcard>();
		this.size = 0;
		this.currentID = 0;
		this.index = 0;
	}
	
	/**
	 * 
	 * @param title - The title for the new card
	 * @param desc - The description/answer for the new card
	 * @return true to indicate that the card was created
	 */
	public void addCard(String title, String desc) {
		flashcards.add(new Flashcard(title, desc, currentID));
		incrementID();
		incrementSize();
	}
	
	/**
	 * 
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
	 * increment the tracking variable for the size of the card list
	 */
	public void incrementSize() {
		size += 1;
	}
	
	/**
	 * 
	 * @return the next card in the list
	 */
	public Flashcard getNext() {
		if (index + 1 == size) {
			index = 0;
		} else {
			index += 1;
		}
		return flashcards.get(index);
	}
	
	/**
	 * 
	 * @return total number of cards marked as correct by the user
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
}
