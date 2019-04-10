package view;

import control.AnimalControl;

/**
 *
 * @author Jeremy
 */
public class AverageAnimalAgeView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public AverageAnimalAgeView() {
        super();
    }

    @Override
    protected String getMessage() {

        String animals2 = AnimalControl.averageAgeOfAnimals();

        return "Average Animal Age\n"
                + "-----------------------\n"
                + "Calculating the average age of the animals in the storehouse...\n"
                + "-----------------------\n"
                + animals2;

    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // This view is not interactive. It just shows the average age of the animals.
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
        //Display the average age of the animals in the storehouse.

        return false;
    }

    private void AverageAnimalAgeView() {
        pause(1500);
        AverageAnimalAgeView view = new AverageAnimalAgeView();
        view.displayView();
    }
}
