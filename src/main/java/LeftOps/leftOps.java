/**
 * @author Tien Huynh <tienhuynhq5@gmail.com>
 * @dateCreate Aug 6, 2019
 */
package LeftOps;

/**
 * @TODO
 */
public class leftOps {
	private int len;
	private int leftRotate;
	private String arrayRaw;

	private boolean stateLog = false;

	/**
	 * @param len
	 * @param leftRotate
	 * @param arrayRaw
	 */
	public leftOps(int len, int leftRotate, String arrayRaw) {
		this.len = len;
		this.leftRotate = leftRotate;
		this.arrayRaw = arrayRaw;
	}

	private void simpleLog(String log) {
		if (stateLog) {
			System.out.println("Simple log of leftOps Class: " + log);
		}
	}

	private String processedArray(String arrayRaw) {
		// Here the requirement is just print out a single line
		// so I choice String type for simple implement solution
		simpleLog("processing ...");
		String processedArray = "";
		String[] array = new String[len];

		array = arrayRaw.split(" ");
		// for the tail
		for (int idx = leftRotate; idx < len; idx++) {
			String elem = array[idx];
			System.out.print(elem + " ");
			processedArray += " " + (elem);
		}
		// for the head
		for (int idx = 0; idx < leftRotate; idx++) {
			String elem = array[idx];
			System.out.print(elem + " ");
			processedArray += " " + (elem);
		}
		System.out.println("");
		return processedArray;
	}

	public String getProcessedString() {
		return processedArray(arrayRaw);
	}
}
