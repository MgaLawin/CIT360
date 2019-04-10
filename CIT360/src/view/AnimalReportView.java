package view;

import Exceptions.GameControlException;
import cityofaaron.CityOfAaron;
import control.GameControl;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Animal;

/**
 *
 * @author Jeremy
 */
public class AnimalReportView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public AnimalReportView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "------------------------\n"
                + "\nAnimal Report Menu\n"
                + "------------------------\n"
                + "P - Print the animals in the storehouse.\n"
                + "Q - Return to the previous menu.\n"
                + "------------------------\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter the file path and name of your file. Example 'C:\\temp\\filename.dat' \n");

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        try {
            GameControl.testInputs(inputs);
        } catch (GameControlException ex) {
            Logger.getLogger(AnimalReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String fileName = inputs[0];
        animalReport(fileName);
        this.console.println("---------------------------------------------\n"
                + "This Animal Report is saved as: " + fileName + "\n"
                + "----------------------------------------------\n"
                + "Returning to Reports Menu\n"
                + "----------------------------------------------\n\n");
        // to end the loop
        return false;
    }

    private void animalReport(String fileName) {
        Animal[] animals = CityOfAaron.getCurrentGame().getTheStorehouse().getAnimals();

        try (PrintWriter animalReport = new PrintWriter(new FileWriter(fileName))) {
            animalReport.println("Animal Report");
            animalReport.println();

            String format = "%-10s %-6s %-6s";
            animalReport.println(String.format(format, "Type", "Age", "Quantity"));
            animalReport.println("---------------------------");

            for (int i = 0; i < animals.length; i++) {
                animalReport.println(String.format(format, animals[i].getname(), animals[i].getAge(), animals[i].getquantity()));
            }
            animalReport.println();
            animalReport.println("---------------------------");
            animalReport.println("End of Animal Report");

            animalReport.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
