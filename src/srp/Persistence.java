package srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {
	
	public void save(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
		File out = new File(filename);
		if (overwrite || !out.exists()) {
			try (PrintStream outStream = new PrintStream(out)) {
				outStream.println(journal);
			}
		}
	}
	
}
