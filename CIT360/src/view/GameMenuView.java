package view;

/**
 *
 * @author Jeremy
 */
//The Game Menu View controls the play of the game.
public class GameMenuView extends ViewBase {

    protected String message;

    /**
     * Constructor
     */
    public GameMenuView() {

    }

    @Override
    protected String getMessage() {
        return "GameMenu\n"
                + "-------------\n"
                + "X - Calculate the average age of animals in the storehouse\n"
                + "Q - Quit the Game\n"
                + "-------------\n";
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

        inputs[0] = getUserInput("What would you like to do? Enter a Letter.");

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

        switch (inputs[0].trim().toUpperCase()) {
            case "X":
                averageAnimalAgeView();
                break;
            case "Q":
                EndGameView();
                return false;
        }
        return true;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private boolean someActionHandler() {

        return true;
    }

    private void EndGameView() {
        EndGameView view = new EndGameView();
        view.displayView();
    }

    private void averageAnimalAgeView() {
        AverageAnimalAgeView view = new AverageAnimalAgeView();
        view.displayView();
    }

}
