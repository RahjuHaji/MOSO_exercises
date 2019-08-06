/**
 * @author Tien Huynh <tienhuynhq5@gmail.com>
 * @dateCreate Aug 6, 2019
 */
package Input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

/**
 * @TODO
 */
public class Input {
	private URL url = getClass().getResource("Testcase.txt");
	private File file = new File(url.getPath());
	private int arrayLenght;
	private int leftRotation;
	private String arrayRaw;
	
	private boolean stateLog = false;
	
	/**
	 */
	public Input() {
		try {
			readFile();
		} catch (Exception e ) {
			simpleLog(e.toString());
		}
	}
	
	private void simpleLog(String log) {
		if (stateLog) {
			System.out.println("Simple log of Input Class: " + log);
		}
	}
	
	private void readFile() throws Exception {
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		try {
			// Here we just support for default input file, not check if input file valid or not		
			for (int indexLine = 1; indexLine <= 2; indexLine++) {
				String line = buffer.readLine();
				if (indexLine == 1) {
					simpleLog("line 1: " + line);
					int len = Integer.parseInt(line.split(" ")[0].trim());
					int leftRotate = Integer.parseInt(line.split(" ")[1].trim());
					
					setArrayLenght(len);
					if (len < leftRotate) {
						int realLeftRotate = leftRotate % len;
						setLeftRotation(realLeftRotate);
					} else {
						setLeftRotation(Integer.parseInt(line.split(" ")[1].trim()));
					}
					simpleLog("len: " + getArrayLenght() + " and left rotation : " + getLeftRotation());
				} else {
					simpleLog("line 2: " + line);
					setArrayRaw(line);
					simpleLog("arrayRaw: " + getArrayRaw());
				}
			}	
		} catch (Exception e) {
			simpleLog(e.toString());
		}
		buffer.close();
	}

	/**
	 * @return the arrayLenght
	 */
	public int getArrayLenght() {
		return arrayLenght;
	}
	
	/**
	 * @param arrayLenght the arrayLenght to set
	 */
	public void setArrayLenght(int arrayLenght) {
		this.arrayLenght = arrayLenght;
	}

	/**
	 * @return the leftRotation
	 */
	public int getLeftRotation() {
		return leftRotation;
	}

	/**
	 * @param leftRotation the leftRotation to set
	 */
	public void setLeftRotation(int leftRotation) {
		this.leftRotation = leftRotation;
	}

	/**
	 * @return the arrayRaw
	 */
	public String getArrayRaw() {
		return arrayRaw;
	}

	/**
	 * @param arrayRaw the arrayRaw to set
	 */
	public void setArrayRaw(String arrayRaw) {
		this.arrayRaw = arrayRaw;
	}
}
