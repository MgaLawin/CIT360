package view;

import cityofaaron.CityOfAaron;
import model.Game;
import control.GameControl;

/**
 *
 * @author Jeremy
 */
public class NewGameView extends ViewBase {

    /**
     * Constructor
     */
    public NewGameView() {
    }

    @Override
    protected String getMessage() {
        return "Let's start a new game!\n";
    }

    //get the set of user inputs
    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter your name, or hit the 'enter' key to return to the Main menu:", true);

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
        // only one action- initialize the game
        // and then set it in the main cityofaaron class

        // If the user hits enter go back to main menu by returning false
        if (inputs[0] == null || inputs[0].equals("")) {
            ErrorView.display(this.getClass().getName(), "You did not enter a valid name. Returning to the Main menu. . . ");
            return false;
        }
        // return false if you want this view to exit and return
        // to the view that called it.
        String playerName = inputs[0];
        createAndStartGame(playerName);

        //return false so we do not keep looping
        return false;

    }

    private void createAndStartGame(String playerName) {
        //Once the gamecontrol is created we will uncomment this and
        // delete the player and game sets

        Game game = GameControl.createNewGame(playerName);

        CityOfAaron.setCurrentGame(game);

        this.console.println();
        this.console.println("Welcome to the game, " + CityOfAaron.getCurrentGame().getThePlayer().getName() + "!\n");

        //when GameMenuView is created we will call it here.
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayView();
    }
}
