package control;

import Exceptions.GameControlException;
import model.Condition;
import model.Game;
import model.Storehouse;
import model.Player;
import model.Animal;

/**
 *
 * @author Jeremy
 */
public class GameControl {

    public static Game createNewGame(String playerName) {
        //Returns a new Game object with everything initialized and ready for the first year of play.

        Player player = new Player();
        player.setName(playerName);

        Game game = new Game();
        game.setThePlayer(player);

        Storehouse storehouse = new Storehouse();

        //create the array
        Animal[] animals = createAnimals();

        //call the method
        storehouse.setAnimals(animals);
        game.setTheStorehouse(storehouse);

        return game;
    }

    public static Animal[] createAnimals() {

        //literal array for animals with name quantity condition age
        Animal[] animals = {
            new Animal("Cow", 5, Condition.Good, 2),
            new Animal("Horse", 5, Condition.Good, 7),
            new Animal("Goat", 2, Condition.Good, 3),
            new Animal("Chicken", 25, Condition.Good, 1)
        };
        return animals;
    }

    public static void testInputs(String[] inputs) throws GameControlException {

        if (inputs[0] == null || inputs[0].equals("")) {
            throw new GameControlException("Inputs invalid. Please try again. Returning to the previous menu.");
        }
    }
}
