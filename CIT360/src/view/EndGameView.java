package view;

/**
 *
 * @author Jeremy
 */
public class EndGameView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public EndGameView() {

    }

    @Override
    protected String getMessage() {

        return "\n\n****************************************************************************************\n"
                + "Thank you for playing the game today. Your game has ended.\n"
                + "Would you like to play again?\n"
                + "Y - to play again\n"
                + "N - to quit\n"
                + "\n******************************************************************************************\n";

    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {
        // Declare the array to have the number of elements you intend to get
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("What would you like to do? Enter Y/N.\n");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;

    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {
        // If the user hits y- display the main menu, if no display a goodbye message
        switch (inputs[0].trim().toUpperCase()) {
            case "Y":
                GameMenuView();
                break;

            case "N":
                this.console.println("Thank you for playing. Good-Bye.\n");
                return false;
        }
        return false;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void GameMenuView() {
        //Call the gamemenuview
        GameMenuView view = new GameMenuView();
        view.displayView();
    }

}
