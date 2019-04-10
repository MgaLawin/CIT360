package control;

import Exceptions.AnimalControlException;
import Exceptions.GameControlException;
import cityofaaron.CityOfAaron;
import model.Animal;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import model.Game;
import model.Storehouse;

/**
 *
 * @author Jeremy
 */
public class AnimalControl {

    public AnimalControl() {
        //empty constructor
    }

    public static String averageAgeOfAnimals() {
        String animalsAgeAvg2;
        String animalsAgeAvg3 = null;
//        Game game = GameControl.createNewGame("NoPlayerName");
        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        Animal[] animals = storehouse.getAnimals();
        if (animals == null) {
            animalsAgeAvg2 = ("There are no animals in the Storehouse. Please add some.");
        } else {
            String animalName;
            int animalQuantity;
            int animalAge;
            int animalTotalAge = 0;
            int animalTotalQty = 0;
            for (Animal animal : animals) {
                animalName = animal.getname();
                animalQuantity = animal.getquantity();
                animalAge = animal.getAge();
                animalTotalQty += animalQuantity;
                animalTotalAge = (animalQuantity * animalAge) + animalTotalAge;
            }
            int animalTotalAgeAvg = animalTotalAge / animalTotalQty;

            animalsAgeAvg3 = ("The cumulative average of the age of all of your animals is: " + animalTotalAgeAvg + ".\n");

        }
        return "-----------------------\n"
                + animalsAgeAvg3 + "\n";
    }

    public static String animalsInStorehouse(String animalReport, String fileName) throws GameControlException, AnimalControlException, FileNotFoundException, IOException {
        animalReport = null;
        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        Animal[] animals = storehouse.getAnimals();
        if (animals == null) {
            throw new AnimalControlException("\nThere are no animals in the Storehouse. Please add some.\n");
        } else {
            String animalName;
            int animalQuantity;
            int animalAge;

            for (Animal animal : animals) {
                animalName = animal.getname();
                animalQuantity = animal.getquantity();
                animalAge = animal.getAge();
                animalReport = (animalReport + "\nYou have " + animalQuantity + " " + animalName + "s that are " + animalAge + " years old in the storehouse.\n");
            }
            if (fileName == null || fileName.equals("")) {
                throw new GameControlException("\nYou cannot have a blank filename.\n");

            }
            try (ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
                //open file write object
                objectStream.writeObject(game);

            } catch (IOException exception) {
//                ErrorView.display("IO Exception:", exception.getMessage());
                return animalReport;
            }

            return animalReport;
        }
    }

}
