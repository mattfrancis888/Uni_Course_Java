package cp213;

import javax.swing.JFrame;

/**
 * @author -- --
 * @author David Brown
 * @version 2019-03-22
 *
 */
public class Main {

    public static void main(String[] args) {
	Main main = new Main();

	// Run one or the other:

	main.RunReactor(400, 50);
	// main.RunReactorController(400, 50);
    }

    /**
     * Run the Reactor model given an initial temperature and an initial rod
     * lengths.
     *
     * @param initialTemperature Initial reactor temperature.
     * @param initialRodsHeight  Initial reactor rods heights.
     */
    public void RunReactor(final double initialTemperature, final int initialRodsHeight) {

	// your code here
    	final ReactorView reactorGUI = new ReactorView();
    	reactorGUI.setVisible(true);

    }

    /**
     * Run the Reactor model with an automatic controller given an initial
     * temperature and an initial rod lengths.
     *
     * @param initialTemperature Initial reactor temperature.
     * @param initialRodsHeight  Initial reactor rods heights.
     */
    public void RunReactorController(final int initialTemperature, final int initialRodsHeight) {

	// your code here

    }

}