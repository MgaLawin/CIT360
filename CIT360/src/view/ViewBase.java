package view;

import java.io.BufferedReader;
import cityofaaron.CityOfAaron;
import java.io.PrintWriter;

/**
 *
 * @author Jeremy
 */
public abstract class ViewBase implements View {

    /*Constructor*/
    public ViewBase() {

    }

    //Get the view's content. This will allow the view to have dynamic content*/
    protected abstract String getMessage();

    //Get the set of inputs from the user
    protected abstract String[] getInputs();

    //Perform the action indicated by the user's input
    public abstract boolean doAction(String[] inputs);
    protected final BufferedReader keyboard = CityOfAaron.getInFile();
    protected final PrintWriter console = CityOfAaron.getOutFile();

    //Controls this view's display/prompt/action loop until
    //the user chooses an action that causes this view to close
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {
            // get the message that should be displayed.
            // Only print it if it is non-null
            String message = getMessage();
            if (message != null) {
                this.console.println(getMessage());
            }

            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

    /**
     * Get the user's input. Keep prompting them until they enter a value.
     *
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a
     * return key)
     * @return
     */
    protected String getUserInput(String prompt, boolean allowEmpty) {

        String input = "";
        boolean inputReceived = false;
        try {
            while (inputReceived == false) {

                this.console.println(prompt);
                input = this.keyboard.readLine();

                // Make sure we avoid a null-pointer error.
                if (input == null) {
                    input = "";
                }

                // Trim any trailing whitespace, including the carriage return.
                input = input.trim();

                if (input.equals("") == false || allowEmpty == true) {
                    inputReceived = true;
                }

                break;

            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input:  " + e.getMessage());
        }
        return input;
    }

    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it ourselves.
     *
     * @param prompt
     * @return
     */
    protected String getUserInput(String prompt) {
        return getUserInput(prompt, false);
    }

    //TODO implement string to integer function in Buy and Sell Land views
    /**
     * Convert String to Integer.
     *
     * @param inputs
     * @return integer value
     */
    protected static int stringToInt(String[] inputs) {
        boolean inputValid = false;
        int stringToInt = 0;
        stringToInt = Integer.parseInt(inputs[0]);
        if (stringToInt < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            inputValid = true;
        }
        return stringToInt;
    }

    // pause the program for 1.5 seconds
    protected static void pause(int miliseconds) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException exception) {
            //ignore this exception for now
        }
    }
}
