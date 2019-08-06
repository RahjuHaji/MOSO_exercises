/**
 * @author Tien Huynh <tienhuynhq5@gmail.com>
 * @dateCreate Aug 6, 2019
 */
package Output;

import java.io.File;
import java.io.FileWriter;

/**
 * @TODO
 */
public class Output {
	private File file = new File("src/main/java/Output/Output.txt");

	private boolean stateLog = false;

	public Output() {
	}

	private void simpleLog(String log) {
		if (stateLog) {
			System.out.println("Simple log of Output Class: " + log);
		}
	}

	public void writeResultToFile(String processedString) {
		// maybe console is not enough
		try {
			FileWriter content = new FileWriter(file);
			content.write(processedString);
			content.close();
		} catch (Exception e) {
			simpleLog(e.toString());
		}
	}
}
