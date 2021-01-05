package srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class BadJournal {

	private String title;
	private List<String> entries;

	public BadJournal(String title) {
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


	// This is not good
	public void save(String filename) throws FileNotFoundException {
		File out = new File(filename);
		try (PrintStream outStream = new PrintStream(out)) {
			outStream.println(toString());
		}
	}

}
