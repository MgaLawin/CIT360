package view;

import java.io.PrintWriter;
import cityofaaron.CityOfAaron;

/**
 *
 * @author Jeremy
 */
public class ErrorView {

    private static PrintWriter console = CityOfAaron.getOutFile();
    private static PrintWriter log = CityOfAaron.getLogFile();

    public static void display(String className, String errorMessage) {
        console.println(
                "\n--- ERROR --------------------------------------"
                + "\n " + errorMessage
                + "\n-----------------------------------------------");

        log.printf("%n%n%s", className + " - " + errorMessage);
    }
}
