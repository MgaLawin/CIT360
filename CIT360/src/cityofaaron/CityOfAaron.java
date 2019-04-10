package cityofaaron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import model.Game;
import view.View;
import view.StartProgramView;

/**
 *
 * @author Jeremy
 */
public class CityOfAaron {

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }
    public static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game game) {
        currentGame = game;
    }

    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CityOfAaron.logFile = logFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            CityOfAaron.inFile
                    = new BufferedReader(new InputStreamReader(System.in));

            CityOfAaron.outFile = new PrintWriter(System.out, true);

            logFile = new PrintWriter("logFile.txt");

            View startProgramView = new StartProgramView();
            startProgramView.displayView();
        } catch (Throwable te) {
            System.out.println("Exception : " + te.toString()
                    + "\nCause:  " + te.getCause()
                    + "\nMessage: " + te.getMessage()
            );

            te.printStackTrace();

        } finally {
            try {
                if (CityOfAaron.inFile != null) {
                    CityOfAaron.inFile.close();
                }
                if (CityOfAaron.outFile != null) {
                    CityOfAaron.outFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing the input/output files..sorry!");
                return;
            }
        }
    }
}
