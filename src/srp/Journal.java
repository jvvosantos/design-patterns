package srp;

import java.util.ArrayList;
import java.util.List;

public class Journal {
	
	private String title;
	private List<String> entries;
	
	public Journal(String title) {
		this.title = title;
		this.entries = new ArrayList<>();
	}
	
	public void addEntry(String entry){
		this.entries.add(entry);
	}
	
	public void removeEntry(int index) {
		this.entries.remove(index);
	}
	
	public int getSize() {
		return this.entries.size();
	}
	
	@Override
	public String toString() {
		return "Journal " + title + ": "+System.lineSeparator()
				+String.join(System.lineSeparator(), this.entries);
	}
}
