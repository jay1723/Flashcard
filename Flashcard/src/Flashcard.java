
public class Flashcard {
	private String title;
	private String description;
	private int id;
	private boolean correct;
	
	// TODO: Implement Optional third argument
	public Flashcard(String title, String desc, int id) {
		this.title = title;
		this.description = desc;
		this.correct = false;
		this.id = id;
	}
	
	// Getters and Setters
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String val) {
		this.title = val;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String val) {
		this.description = val;
	}
	
	public boolean getCorrect() {
		return this.correct;
	}
	
	public void setCorrect(boolean val) {
		this.correct = val;
	}
	
	// ID is not set-able attribute
	public int getID() {
		return this.id;
	}
}
