package view;

/**
 *
 * @author Jeremy
 */
public class StartProgramView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public StartProgramView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "\n\n****************************************************************************************\n"
            + " Welcome to the city of Aaron. You have been chosen to be the chief ruler in the city.\n"
            + " Your responsibilities are to buy and sell land, determine how much wheat to plant each year\n "
            + "and how much to set aside to feed the people. You are also responsible to pay the annual\n "
            + "tithing on the wheat that is harvested. If you fail to provide enough wheat for the people,\n"
            + " people will starve, people will die, and your workforce will be diminished.\n  "
            + "If too many people die, you will be kicked out of office and  the game will end. \n"
            + "Plan carefully. Also be aware that there is always a danger of rats eating your wheat . . .\n"
            + "**************************************************************************************************\n";

    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // This view is not interactive. It just shows the game description.
        return null;
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
        // There are no inputs for this view we are just going to pause for a few seconds and then load the main menu
        startMainMenuView();
        return false;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void startMainMenuView() {
        pause(1500);
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}
