/**
 * @author Tien Huynh <tienhuynhq5@gmail.com>
 * @dateCreate Aug 6, 2019
 */
package tien;

import Input.Input;
import LeftOps.leftOps;
import Output.Output;

/**
 * @TODO
 */
public class Helloworld {

	private static boolean stateLog = false;

	private static void simpleLogInfo(String state) {
		if (stateLog) {
			System.out.println("Simple Log of main Class" + state + "\n");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		simpleLogInfo("Hello World, today we run a leftOps for array: \n");

		String state = "get input from file";
		simpleLogInfo(state);
		final Input input = new Input();
		final int len = input.getArrayLenght();
		final int leftRotate = input.getLeftRotation();
		final String arrayRaw = input.getArrayRaw();

		state = "processing";
		simpleLogInfo(state);
		leftOps leftOps = new LeftOps.leftOps(len, leftRotate, arrayRaw);
		final String processedString = leftOps.getProcessedString();
		simpleLogInfo("now we got :" + processedString);

		state = "delivery";
		simpleLogInfo(state);
		Output output = new Output();
		output.writeResultToFile(processedString);
	}

}
