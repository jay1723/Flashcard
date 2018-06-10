
public class Flashcard {
	private String title;
	private String description;
	private boolean correct;
	
	// TODO: Implement Optional third argument
	public Flashcard(String title, String desc, boolean correct) {
		this.title = title;
		this.description = desc;
		this.correct = correct;
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
}
